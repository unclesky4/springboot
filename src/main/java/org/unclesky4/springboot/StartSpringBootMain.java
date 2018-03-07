package org.unclesky4.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;


/**
 * 
 * 程序类约定放在启动类的子包中，因此有@SpringBootApplication注解
 * 
 * @SpringBootApplication:
 * 			启动SpringBoot程序，包含子包扫描，相当于: @EnableAutoConfiguration + @ComponentScan() + 其他配置
 * 
 * 案例：
 * @EnableAutoConfiguration
 * @ComponentScan("org.unclesky4.springboot")
 */
@SpringBootApplication
@ServletComponentScan //开启springboot的servlet扫描功能
public class StartSpringBootMain {
	
	/**
     * druid监控
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean reg = new ServletRegistrationBean();
        reg.setServlet(new StatViewServlet());
        reg.addUrlMappings("/druid/*");
        //reg.addInitParameter("allow", "127.0.0.1");
        //reg.addInitParameter("deny","");
        reg.addInitParameter("loginUsername", "uncle");
        reg.addInitParameter("loginPassword", "uncle");
        return reg;
    }

    /**
     * druid监控过滤
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootMain.class, args);
	}

}
