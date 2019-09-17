package pl.com.sages.beandemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.com.sages.beandemo.http.HttpClient;
import pl.com.sages.beandemo.http.MovieDownloader;
import pl.com.sages.beandemo.http.MusicDownloader;
import pl.com.sages.beandemo.service.BookService;

@SpringBootApplication
@Slf4j
//@RequiredArgsConstructor
public class BeanDemoApplication implements CommandLineRunner {

    private final BookService bookService;
    private final BookService modernBookService;
    private final HttpClient httpClient;

    public BeanDemoApplication(
            @Qualifier(value = "bookServiceImpl") BookService bookService,
            @Qualifier(value = "modern") BookService modernBookService,
            HttpClient httpClient) {
        this.bookService = bookService;
        this.modernBookService = modernBookService;
        this.httpClient = httpClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanDemoApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        log.info("{}", bookService.getAllBooks());
        log.info("{}", modernBookService.getAllBooks());
        log.info("{}", httpClient);

        //var httpClient = HttpClientFactory.create();
    }
}
