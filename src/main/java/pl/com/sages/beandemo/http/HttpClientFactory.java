package pl.com.sages.beandemo.http;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpClientFactory {
    public static HttpClient create() {
        log.info("HttpClient.create");
        var client = new HttpClient();
        client.init();
        return client;
    }
}
