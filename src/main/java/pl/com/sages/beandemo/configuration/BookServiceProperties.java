package pl.com.sages.beandemo.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import pl.com.sages.beandemo.model.Book;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "book-service-props")
@Setter
@Getter
@ToString
@Validated
public class BookServiceProperties {
    @Min(10)
    @Max(20)
    int rating;
    @NotBlank
    String extendedDescription;
    List<Book> books;
}
