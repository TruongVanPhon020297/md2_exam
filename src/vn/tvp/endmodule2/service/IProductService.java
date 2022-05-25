package vn.tvp.endmodule2.service;

import vn.tvp.endmodule2.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product newProduct);

    void update(Product newProduct);

    Product findById(int id);

    boolean exist(int id);

    boolean existByName(String name);

    boolean existsById(int id);

    void deleteById(int id);

    List<Product> findAllOrderByPriceASC();

    List<Product> findAllOrderByPriceDESC();

    public Product findMaxPrice();
}
