package persistence;

import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Long> {
}

