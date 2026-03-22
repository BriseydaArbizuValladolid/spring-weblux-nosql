package ap1.briseyda.arbizu.repository;

import ap1.briseyda.arbizu.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, Long> {
    
}
