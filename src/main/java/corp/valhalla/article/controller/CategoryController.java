package corp.valhalla.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import corp.valhalla.article.model.Category;
import corp.valhalla.article.response.Response;
import corp.valhalla.article.service.CategoryService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/category/")
	public Mono<Category> add(@RequestBody Category category ) {
        return this.categoryService.save( category );
    }
	
	@CrossOrigin(origins = "*")
    @GetMapping("/api/categories")
	public Flux<Category> getAll() {
        return this.categoryService.getAll();
    }
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/category/del/{uuid}")
	public ResponseEntity<Response> del(@PathVariable("uuid")String uuid) {
        this.categoryService.delete( uuid ).subscribe();
//        this.categoryService.delete().subscribe();
    	return new ResponseEntity<>(new Response("OK"), HttpStatus.OK);

    }
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/category/{uuid}")
	public Mono<Category> getById(@PathVariable("uuid")String uuid) {
        return this.categoryService.getById(uuid);
    }
}
