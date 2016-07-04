package br.com.spring.redis.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
public class HttpSessionConfig {
	
//	@Bean
//    public JedisConnectionFactory connectionFactory() {
//			  JedisConnectionFactory cf = new JedisConnectionFactory();
//			  cf.setHostName("10.0.75.2");
//			  cf.setPort(6379);
//			  return cf;
//    }
}
