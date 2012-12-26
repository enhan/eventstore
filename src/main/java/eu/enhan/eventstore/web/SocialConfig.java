package eu.enhan.eventstore.web;

import eu.enhan.eventstore.core.config.AppConfig;
import eu.enhan.eventstore.core.social.SocialComponent;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

import javax.inject.Inject;
import javax.sql.DataSource;

@Configuration
@Import(AppConfig.class)
public class SocialConfig {

	@Inject
	private Environment environment;

	@Inject
	private DataSource dataSource;

	@Bean
	public ConnectionFactoryLocator connectionFactoryLocator(){
		ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
		registry.addConnectionFactory(new FacebookConnectionFactory(environment.getProperty("facebook.clientId"), environment.getProperty("facebook.clientSecret")));
		return registry;
	}

	@Bean
	public UsersConnectionRepository usersConnectionRepository(){
		JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource,connectionFactoryLocator(), Encryptors.noOpText());
		repository.setConnectionSignUp(new SocialComponent());
		return  repository;
	}


	/*@Bean
	@Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
	public ConnectionRepository connectionRepository(){
		User
	}*/

}
