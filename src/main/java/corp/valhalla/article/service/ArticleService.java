package corp.valhalla.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import corp.valhalla.article.model.Article;
import corp.valhalla.article.model.Category;
import corp.valhalla.article.repository.ArticleRepository;
import corp.valhalla.article.repository.CategoryRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	@Transactional
	public Mono<Article> save( Article entity ){
		return this.articleRepository.save(entity);
	}
	
	public Flux<Article> getAll(){
		return this.articleRepository.findAll();
	}
	
	@Transactional
	public Mono<Void> delete( String uuid ){
//		this.categoryRepository.deleteById(uuid);
		return this.articleRepository.deleteById(uuid);
	}
	
	public Mono<Void> delete(){
		return this.articleRepository.deleteAll();
	}
	
	public Mono<Article> getById( String uuid ){
		return this.articleRepository.findById(uuid);
	}
}
