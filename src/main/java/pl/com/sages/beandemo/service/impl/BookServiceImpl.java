package pl.com.sages.beandemo.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.com.sages.beandemo.configuration.BookServiceProperties;
import pl.com.sages.beandemo.model.Book;
import pl.com.sages.beandemo.service.BookService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Component
@ToString
@Slf4j
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookServiceProperties properties;

    @PostConstruct
    private void init() {
        log.info("init: {}", this);
    }

    @Value("${book-service.description:Brak}")
    private String description;

    @Value("${book-service.total-value}")
    private int totalValue;

    @Value("#{T(java.time.LocalDate).parse('${book-service.creation-date}')}")
    private LocalDate creationDate;

    @Value("#{(new java.util.Random()).nextBoolean()}")
    private boolean open;

    @Override
    public List<Book> getAllBooks() {
        return properties.getBooks();
    }
}
