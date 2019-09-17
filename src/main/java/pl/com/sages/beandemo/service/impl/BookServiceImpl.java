package pl.com.sages.beandemo.service.impl;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.com.sages.beandemo.model.Book;
import pl.com.sages.beandemo.service.BookService;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component
@Slf4j
@ToString
public class BookServiceImpl implements BookService, InitializingBean {
    @Value("${book-service.description}")
    private String description;

    @Value("${book-service.creation-year}")
    private int creationYear;

    @Value("${book-service.extended-description:Brak wartosci}")
    private String extendedDescription;

    @PostConstruct
    private void init() {
        log.info("init: {}", this);
    }

    @Override
    public List<Book> getAllBooks() {
        return Collections.singletonList(Book.builder().title("Dziady").build());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet: {}", this);
    }
}
