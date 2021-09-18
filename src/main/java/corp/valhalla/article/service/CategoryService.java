package corp.valhalla.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import corp.valhalla.article.repository.CategoryRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import corp.valhalla.article.model.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Sort.Direction getSortDirection(String direction) {
	    if (direction.equals("asc")) {
	      return Sort.Direction.ASC;
	    } else if (direction.equals("desc")) {
	      return Sort.Direction.DESC;
	    }
	
	    return Sort.Direction.ASC;
	}
	
	@Transactional
	public Mono<Category> save( Category entity ){
		return this.categoryRepository.save(entity);
	}
	
	public Flux<Category> getAll(){
		return this.categoryRepository.findAll();
	}
	
	@Transactional
	public Mono<Void> delete( String uuid ){
//		this.categoryRepository.deleteById(uuid);
		return this.categoryRepository.deleteById(uuid);
	}
	
	public Mono<Void> delete(){
		return this.categoryRepository.deleteAll();
	}
	
	public Mono<Category> getById( String uuid ){
		return this.categoryRepository.findById(uuid);
	}
}
