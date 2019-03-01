package cn.itsource.bigou.util;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {

    static JedisPool jedisPool = null;

    static {
        GenericObjectPoolConfig poolConfig = new JedisPoolConfig();
        //参数设置：
        poolConfig.setMaxTotal(30);//最大连接数
        poolConfig.setMaxIdle(10);//最大空闲数
        poolConfig.setMaxWaitMillis(3*1000);//超时时间
        poolConfig.setTestOnBorrow(true);//借的时候拿来测试

        //你在做的时候，应该丢到properties的配置文件：直接用这个工具类
        String host = "127.0.0.1";
        int port = 6379;
        int timeout = 5*1000;
        String password = "cc0399";
        jedisPool = new JedisPool(poolConfig, host, port, timeout, password);

    }

    /**
     *
     * 设置
     * */
    public static void set(String key,String value){
        //1.获取jedis实例
        Jedis jedis = jedisPool.getResource();
        try {
            //2.api操作
            jedis.set(key,value );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //3.资源换回
            jedis.close();
        }
    }

    /**
     * 获取
     * @param key
     * @return
     */
    public static String get(String key) {
        //1.获取jedis实例
        Jedis resource = jedisPool.getResource();
        try {
            //2.api操作
            return resource.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //3.资源换回
            resource.close();
        }
    }
}
