package pl.com.sages.beandemo.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "book-service-props")
@Setter
@Getter
@ToString
public class BookServiceProperties {
    int rating;
    String extendedDescription;
}
