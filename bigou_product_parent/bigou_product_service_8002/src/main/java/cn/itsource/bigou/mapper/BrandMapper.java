package cn.itsource.bigou.mapper;

import cn.itsource.bigou.domain.Brand;
import cn.itsource.bigou.query.BrandQuery;
import cn.itsource.bigou.util.PageList;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author zdjtest
 * @since 2019-02-27
 */
public interface BrandMapper extends BaseMapper<Brand> {

    List<Brand> queryPage(BrandQuery query);

    long queryPageCount(BrandQuery query);
}
