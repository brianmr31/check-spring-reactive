package corp.valhalla.article.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Category {

	@Id
	private UUID id; 
	
	private String name;
	private String companyKey;
	
	public Category() {
		
	}
	
	public Category(UUID id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public UUID getId() {
		return this.id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompanyKey() {
		return this.companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
}
