create table IF NOT EXISTS Category ( id varchar (255) NOT NULL DEFAULT RANDOM_UUID() PRIMARY KEY ,
	name varchar(255) not null,
	company_key varchar(255) not null );
// DELETE FROM Category;

// DELETE FROM Article;
create table IF NOT EXISTS Article ( 
	id varchar (255) NOT NULL DEFAULT RANDOM_UUID() PRIMARY KEY ,
	title varchar(255) not null,
	content Text not null,
	create_by varchar(255) not null,
	create_date BIGINT,
	publish_date BIGINT,
	company_key varchar(255) not null 
);