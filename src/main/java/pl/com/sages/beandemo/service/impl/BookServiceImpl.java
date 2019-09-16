package pl.com.sages.beandemo.service.impl;

import org.springframework.stereotype.Component;
import pl.com.sages.beandemo.model.Book;
import pl.com.sages.beandemo.service.BookService;

import java.util.Collections;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> getAllBooks() {
        return Collections.singletonList(Book.builder().title("Dziady").build());
    }
}
