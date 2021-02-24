package cn.sm1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import cn.sm1234.servelet.HelloFilter;
import cn.sm1234.servelet.HelloListener;
import cn.sm1234.servelet.HelloServlet;

@SpringBootApplication
//改用@Bean
//@ServletComponentScan //讓SpringBoot掃描@WebServlet等註解
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}
	//註冊servlet
	@Bean
	public ServletRegistrationBean getServletRegistrationBean(){
		ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet());
		
		bean.addUrlMappings("/helloServlet");
		return bean;
	}
	
	//註冊filter
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean(){
		FilterRegistrationBean bean = new FilterRegistrationBean(new HelloFilter());
		
		bean.addUrlPatterns("/helloServlet");
		return bean;
	}
	
	//註冊listener
	@Bean
	public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean(){
		ServletListenerRegistrationBean<HelloListener> bean = new ServletListenerRegistrationBean<HelloListener>(new HelloListener());
		
		return bean;
	}

}
