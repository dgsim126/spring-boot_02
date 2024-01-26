package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCources(){
		return configuration;
	}

}

/*
1. LearnSpringBootApplication 클래스의 main 메서드:
	public static void main(String[] args) 메서드에서 SpringApplication.run(LearnSpringBootApplication.class, args)을 호출하여 스프링 부트 애플리케이션을 시작합니다.

2. @SpringBootApplication 어노테이션:
	@SpringBootApplication 어노테이션이 부트스트랩을 수행하며, 스프링 컨텍스트가 초기화됩니다. 이 어노테이션은 여러 다른 어노테이션들을 포함하고 있어 자동으로 많은 설정을 처리합니다.

3. CurrencyServiceConfiguration 클래스의 @ConfigurationProperties 어노테이션:
	CurrencyServiceConfiguration 클래스에 있는 @ConfigurationProperties(prefix = "currency-service") 어노테이션은 설정 파일 (application.properties)에서 currency-service로 시작하는 속성들을 읽어와 CurrencyServiceConfiguration 빈에 주입합니다.
	예를 들어, 설정 파일에 있는 currency-service.url, currency-service.username, currency-service.key 속성들의 값을 CurrencyServiceConfiguration 클래스의 url, username, key 필드에 매핑합니다.

4. CurrencyConfigurationController 클래스:
	CurrencyConfigurationController 클래스는 @RestController 어노테이션이 붙어 있어 RESTful 웹 서비스의 컨트롤러로 동작합니다.
	@Autowired 어노테이션을 사용하여 CurrencyServiceConfiguration 빈을 주입받습니다.

5. @RequestMapping("/currency-configuration"):
	@RequestMapping("/currency-configuration") 어노테이션은 "/currency-configuration" 경로로 들어오는 HTTP GET 요청을 처리하는 메서드를 지정합니다.
	해당 메서드는 CurrencyServiceConfiguration 빈을 반환합니다.

6. HTTP 요청 처리:
	사용자가 웹 브라우저에서 http://localhost:8080/currency-configuration 주소를 입력하면, 스프링 부트 내장 웹 서버는 해당 요청을 받아서 CurrencyConfigurationController의 retrieveAllCources 메서드를 실행합니다.
	retrieveAllCources 메서드는 CurrencyServiceConfiguration 빈을 반환하고, 스프링 부트는 이를 JSON 형식으로 변환하여 응답합니다.

7. JSON 응답:
스프링 부트는 CurrencyServiceConfiguration 객체를 JSON 형식으로 변환하여 응답합니다.
 */
