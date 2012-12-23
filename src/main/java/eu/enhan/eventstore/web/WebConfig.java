package eu.enhan.eventstore.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"eu.enhan.eventstore.web"}, excludeFilters = { @ComponentScan.Filter(Configuration.class) })
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		ResourceHandlerRegistration  html = registry.addResourceHandler("/app/**");
		html.addResourceLocations("/static/html/**");
		ResourceHandlerRegistration css = registry.addResourceHandler("css/**");
		css.addResourceLocations("/static/css/**");
		ResourceHandlerRegistration js = registry.addResourceHandler("js/**");
		js.addResourceLocations("/static/js/**");
		ResourceHandlerRegistration img = registry.addResourceHandler("img/**");
		img.addResourceLocations("/static/img/**");
	}
}
