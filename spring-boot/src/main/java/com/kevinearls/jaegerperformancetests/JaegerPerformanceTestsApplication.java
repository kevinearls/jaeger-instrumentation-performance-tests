package com.kevinearls.jaegerperformancetests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.logging.Logger;

@SpringBootApplication
public class JaegerPerformanceTestsApplication {
    private static Map<String, String> envs = System.getenv();

    private static Integer JAEGER_FLUSH_INTERVAL = new Integer(envs.getOrDefault("JAEGER_FLUSH_INTERVAL", "100"));
    private static Integer JAEGER_MAX_PACKET_SIZE = new Integer(envs.getOrDefault("JAEGER_MAX_PACKET_SIZE", "0"));
    private static Integer JAEGER_MAX_QUEUE_SIZE = new Integer(envs.getOrDefault("JAEGER_MAX_QUEUE_SIZE", "50"));
    private static Double JAEGER_SAMPLING_RATE = new Double(envs.getOrDefault("JAEGER_SAMPLING_RATE", "1.0"));
    private static Integer JAEGER_UDP_PORT = new Integer(envs.getOrDefault("JAEGER_UDP_PORT", "5775"));
    private static String JAEGER_AGENT_HOST = envs.getOrDefault("JAEGER_AGENT_HOST", "localhost");
    private static final String TRACER_TYPE = envs.getOrDefault("TRACER_TYPE", "jaeger");
    private static  String TEST_SERVICE_NAME = envs.getOrDefault("TEST_SERVICE_NAME", "spring-boot-opentracing-demo");

    private static Logger logger = Logger.getLogger(JaegerPerformanceTestsApplication.class.getName());

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(JaegerPerformanceTestsApplication.class, args);
	}
}
