package domain;

import java.util.List;

public interface ProductRepository {
    <Product> List<Product> findAll();
    <Product> Product findById(Long id);
    <Product> Product save(Product product);
}

