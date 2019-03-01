package cn.itsource.bigou.service.impl;

import cn.itsource.bigou.domain.Brand;
import cn.itsource.bigou.mapper.BrandMapper;
import cn.itsource.bigou.query.BrandQuery;
import cn.itsource.bigou.service.IBrandService;
import cn.itsource.bigou.util.PageList;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author zdjtest
 * @since 2019-02-27
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageList<Brand> queryPage(BrandQuery query) {
        //Mapper.xml查询的是分页的数据
        //1.设置总的页数
        /*PageList<Brand> pageList = new PageList<>();
        pageList.setTotal(page.getTotal());*/

        PageList<Brand> pageList = new PageList<>();
        long totalcount = brandMapper.queryPageCount(query);
        if (totalcount>0){
            pageList.setTotal(totalcount);
            //2.设置当前分页数据
            List<Brand> brands = brandMapper.queryPage(query);
            pageList.setRows(brands);
        }

        return pageList;
    }
}
