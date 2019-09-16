package pl.com.sages.beandemo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.com.sages.beandemo.model.Book;
import pl.com.sages.beandemo.service.BookService;

import java.util.Collections;
import java.util.List;

@Component(value = "modern")
@Primary
public class ModernBookServiceImpl implements BookService {
    @Override
    public List<Book> getAllBooks() {
        return Collections.singletonList(Book.builder().title("50 shades of Grey").build());
    }
}
