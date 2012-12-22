package eu.enhan.eventstore.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@ComponentScan(basePackages = {"eu.enhan.eventstore.core"}, excludeFilters = { @ComponentScan.Filter(Configuration.class) })
public class AppConfig {


}
