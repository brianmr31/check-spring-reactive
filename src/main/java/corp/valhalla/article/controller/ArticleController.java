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

import corp.valhalla.article.model.Article;
import corp.valhalla.article.response.Response;
import corp.valhalla.article.service.ArticleService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/article/")
	public Mono<Article> add(@RequestBody Article article ) {
        return this.articleService.save( article );
    }
	
	@CrossOrigin(origins = "*")
    @GetMapping("/api/articlies")
	public Flux<Article> getAll() {
        return this.articleService.getAll();
    }
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/article/del/{uuid}")
	public ResponseEntity<Response> del(@PathVariable("uuid")String uuid) {
        this.articleService.delete( uuid ).subscribe();
//        this.categoryService.delete().subscribe();
    	return new ResponseEntity<>(new Response("OK"), HttpStatus.OK);

    }
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/article/{uuid}")
	public Mono<Article> getById(@PathVariable("uuid")String uuid) {
        return this.articleService.getById(uuid);
    }
	
}
