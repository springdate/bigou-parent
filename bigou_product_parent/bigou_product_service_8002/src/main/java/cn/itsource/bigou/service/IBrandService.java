package cn.itsource.bigou.service;

import cn.itsource.bigou.domain.Brand;
import cn.itsource.bigou.query.BrandQuery;
import cn.itsource.bigou.util.PageList;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author zdjtest
 * @since 2019-02-27
 */
public interface IBrandService extends IService<Brand> {
    /**
     * Brand 的分页条件查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);
}
