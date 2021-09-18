package corp.valhalla.article;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArticleApplication {
	
	public static void main(String[] args) {
		
		Date date = new Date(); 
		long longDate=date.getTime();
		System.out.println("Today is " +longDate );
		
		SpringApplication.run(ArticleApplication.class, args);
	}

	
}
