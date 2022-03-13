package com.shf.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    /**
     * 配置负载均衡实现RestTemplate
     * IRule
     * RoundRobinRule  轮询
     * AvailabilityFilteringRule： 会先过滤掉故障的服务，对剩下的进行轮询
     * Retury：会先按照轮询获取服务，如果服务获取失败，则会在指定的时间内进行重试
     * @return
     */

    @Bean
    @LoadBalanced // 配置负载均衡实现restTemplate
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
