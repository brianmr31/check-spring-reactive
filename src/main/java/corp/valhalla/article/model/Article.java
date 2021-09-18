package corp.valhalla.article.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Article {
	
	@Id
	private UUID id; 
	
	private String title;
	private String content;
	private String createBy;
	
	private long createDate;
	
	private long publishDate;
	private String companyKey;
	
	public Article() {
		
	}
	
	public Article(String title, String content, String createBy, String companyKey) {
		this.title = title;
		this.content = content;
		this.createBy = createBy;
		this.companyKey = companyKey;
	}
	
	public Article(String title, String content, String createBy, Long createDate, String companyKey) {
		this.title = title;
		this.content = content;
		this.createBy = createBy;
		this.createDate = createDate;
		this.companyKey = companyKey;
	}
	
	public Article(String title, String content, String createBy, long createDate, long publishDate, String companyKey) {
		this.title = title;
		this.content = content;
		this.createBy = createBy;
		this.createDate = createDate;
		this.companyKey = companyKey;
		this.publishDate = publishDate;
	}
	
	public UUID getId() {
		return this.id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getCreateBy() {
		return this.createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	public long getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	
	public long getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(long publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getCompanyKey() {
		return this.companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
}
