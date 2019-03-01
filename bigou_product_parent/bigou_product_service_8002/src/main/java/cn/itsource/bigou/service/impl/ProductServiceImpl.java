package cn.itsource.bigou.service.impl;

import cn.itsource.bigou.domain.Product;
import cn.itsource.bigou.mapper.ProductMapper;
import cn.itsource.bigou.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author zdjtest
 * @since 2019-02-27
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
