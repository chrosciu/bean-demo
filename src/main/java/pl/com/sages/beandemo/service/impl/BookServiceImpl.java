package pl.com.sages.beandemo.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.com.sages.beandemo.configuration.BookServiceProperties;
import pl.com.sages.beandemo.model.Book;
import pl.com.sages.beandemo.service.BookService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
@Slf4j
@ToString
@RequiredArgsConstructor
public class BookServiceImpl implements BookService, InitializingBean {
    private final BookServiceProperties properties;

    @Value("${book-service.description}")
    private String description;

    @Value("${book-service.creation-year}")
    private int creationYear;

    @Value("${book-service.extended-description:Brak wartosci}")
    private String extendedDescription;

    @Value("#{(new java.util.Random()).nextBoolean()}")
    private boolean open;

    //@Value("${book-service.creation-date}")
    @Value("#{T(java.time.LocalDate).parse('${book-service.creation-date}')}")
    private LocalDate creationDate;

    @PostConstruct
    private void init() {
        log.info("init: {}", this);
        //open = new Random().nextBoolean();
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
