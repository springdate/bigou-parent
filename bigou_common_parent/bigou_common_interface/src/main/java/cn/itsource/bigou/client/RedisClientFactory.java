package cn.itsource.bigou.client;

import feign.hystrix.FallbackFactory;

public class RedisClientFactory implements FallbackFactory<RedisClient>{
    @Override
    public RedisClient create(Throwable throwable) {
        return new RedisClient() {
            @Override
            public void set(String key, String value) {

            }

            @Override
            public String get(String key) {
                return null;
            }
        };
    }
}
