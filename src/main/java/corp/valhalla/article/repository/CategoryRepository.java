package corp.valhalla.article.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import corp.valhalla.article.model.Category;

public interface CategoryRepository extends ReactiveCrudRepository<Category, String> {

}