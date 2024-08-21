package domain;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll();
    }

    public <Product> Product getProductById(Long id) {
        return productRepository.findById(id);
    }

    public ProductDTO saveProduct(ProductDTO product) {
        return productRepository.save(product);
    }
}
