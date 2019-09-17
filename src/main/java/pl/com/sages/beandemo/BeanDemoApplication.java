package pl.com.sages.beandemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.com.sages.beandemo.http.HttpClient;
import pl.com.sages.beandemo.service.BookService;
import pl.com.sages.beandemo.service.CalculatorService;

@SpringBootApplication
@Slf4j
//@RequiredArgsConstructor
@EnableAspectJAutoProxy
public class BeanDemoApplication implements CommandLineRunner {

    private final BookService bookService;
    private final BookService modernBookService;
    private final HttpClient httpClient;
    private final CalculatorService calculatorService;

    public BeanDemoApplication(
            @Qualifier(value = "bookServiceImpl") BookService bookService,
            @Qualifier(value = "modern") BookService modernBookService,
            HttpClient httpClient, CalculatorService calculatorService) {
        this.bookService = bookService;
        this.modernBookService = modernBookService;
        this.httpClient = httpClient;
        this.calculatorService = calculatorService;
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

        var division = calculatorService.divide(1 , 0);
        log.info("division result: {}", division);
    }
}
