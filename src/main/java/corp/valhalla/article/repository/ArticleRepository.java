package corp.valhalla.article.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import corp.valhalla.article.model.Article;

public interface ArticleRepository extends ReactiveCrudRepository<Article, String>  {

}
