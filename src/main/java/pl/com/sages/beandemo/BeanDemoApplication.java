package pl.com.sages.beandemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.com.sages.beandemo.service.BookService;
import pl.com.sages.beandemo.service.impl.BookServiceImpl;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class BeanDemoApplication implements CommandLineRunner {

    private final BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BeanDemoApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        log.info("{}", bookService.getAllBooks());
    }
}
