package pl.com.sages.beandemo.http;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfiguration {

    @Bean
    public HttpClient httpClient() {
       return HttpClientFactory.create();
    }

}
