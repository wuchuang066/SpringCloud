package zpark.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    // 负载均衡注解
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    // 开启随机策略
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
