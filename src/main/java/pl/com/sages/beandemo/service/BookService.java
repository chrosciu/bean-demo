package pl.com.sages.beandemo.service;

import org.springframework.stereotype.Component;
import pl.com.sages.beandemo.model.Book;

import java.util.Collections;
import java.util.List;

@Component
public class BookService {
    public List<Book> getAllBooks() {
        return Collections.singletonList(Book.builder().title("Dziady").build());
    }
}
