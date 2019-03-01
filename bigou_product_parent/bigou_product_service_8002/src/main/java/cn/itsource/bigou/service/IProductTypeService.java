package cn.itsource.bigou.service;

import cn.itsource.bigou.domain.ProductType;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author zdjtest
 * @since 2019-02-27
 */
public interface IProductTypeService extends IService<ProductType> {
    /**
     * tree树结构
     * @return
     */
    List<ProductType> treeData();
}
