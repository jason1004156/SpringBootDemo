package cn.sm1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot的啟動器
 * @author lenovo
 *
 */

@SpringBootApplication
public class Application {
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
