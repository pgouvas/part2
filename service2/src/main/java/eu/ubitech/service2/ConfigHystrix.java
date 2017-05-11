
package eu.ubitech.service2;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigHystrix {
 
       @Bean(name = "hystrixRegistrationBean")
       public ServletRegistrationBean servletRegistrationBean() {
             ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/hystrix.stream");
             registration.setName("hystrixServlet");
             registration.setLoadOnStartup(1);
             return registration;
       }
}