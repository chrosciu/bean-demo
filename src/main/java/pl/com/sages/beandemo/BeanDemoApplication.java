package pl.com.sages.beandemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import pl.com.sages.beandemo.service.BookService;

@SpringBootApplication
@Slf4j
public class BeanDemoApplication implements CommandLineRunner {

    private BookService bookService;

    @Autowired
    public BeanDemoApplication(BookService bookService) {
        this.bookService = bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("{}", bookService.getAllBooks());
    }
}
