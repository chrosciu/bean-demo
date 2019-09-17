package pl.com.sages.beandemo.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import pl.com.sages.beandemo.model.Book;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "book-service-new")
@Getter
@Setter
@ToString
@Validated
public class BookServiceProperties {
    //@Min(10)
    private int rating;
    private List<Book> books = new ArrayList<>();
}
