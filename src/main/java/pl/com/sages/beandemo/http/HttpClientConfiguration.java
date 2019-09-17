package pl.com.sages.beandemo.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class HttpClientConfiguration {

    @Bean
    public HttpClient httpClient() {
        log.info("httpClient()");
        return HttpClientFactory.create();
    }

    @Bean
    public MovieDownloader movieDownloader() {
        log.info("movieDownloader()");
        return new MovieDownloader(httpClient());
    }

    @Bean
    public MusicDownloader musicDownloader() {
        log.info("musicDownloader()");
        return new MusicDownloader(httpClient());
    }

}
