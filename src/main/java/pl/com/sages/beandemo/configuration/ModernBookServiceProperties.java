package pl.com.sages.beandemo.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "modern-book-service-props")
@Setter
@Getter
@ToString
public class ModernBookServiceProperties {
    private String address;
    private int rating;

}
