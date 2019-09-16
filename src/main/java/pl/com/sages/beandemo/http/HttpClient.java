package pl.com.sages.beandemo.http;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Slf4j
//@Component
public class HttpClient {
    protected void init() {
        log.info("HttpClient init");
    }
}
