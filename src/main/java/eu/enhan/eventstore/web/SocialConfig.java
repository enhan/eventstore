package eu.enhan.eventstore.web;

import eu.enhan.eventstore.core.config.AppConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import javax.inject.Inject;
import javax.sql.DataSource;

@Configuration
@Import(AppConfig.class)
public class SocialConfig {

	@Inject
	private Environment environment;

	@Inject
	private DataSource dataSource;




}
