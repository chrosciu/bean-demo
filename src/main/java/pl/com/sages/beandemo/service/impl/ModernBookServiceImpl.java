package pl.com.sages.beandemo.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.com.sages.beandemo.configuration.ModernBookServiceProperties;
import pl.com.sages.beandemo.model.Book;
import pl.com.sages.beandemo.service.BookService;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component(value = "modern")
@Primary
@ToString
@RequiredArgsConstructor
@Slf4j
public class ModernBookServiceImpl implements BookService {
    private final ModernBookServiceProperties properties;

    @PostConstruct
    private void init() {
        log.info("{}", this);
    }

    @Override
    public List<Book> getAllBooks() {
        return Collections.singletonList(Book.builder().title("50 shades of Grey").build());
    }
}
