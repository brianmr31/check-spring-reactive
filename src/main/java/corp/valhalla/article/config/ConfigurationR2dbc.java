package corp.valhalla.article.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import io.r2dbc.spi.ConnectionFactory;

@Configuration
public class ConfigurationR2dbc {
	
	@Bean
	public ConnectionFactoryInitializer initializer( @Qualifier("connectionFactory") ConnectionFactory connectionFactory ) {
		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
	    initializer.setConnectionFactory( (io.r2dbc.spi.ConnectionFactory) connectionFactory);

	    CompositeDatabasePopulator populator = new CompositeDatabasePopulator();
	    populator.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
	    initializer.setDatabasePopulator(populator);

	    return initializer;
	}
}
