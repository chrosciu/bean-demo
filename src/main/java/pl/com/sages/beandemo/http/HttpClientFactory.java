package pl.com.sages.beandemo.http;

public class HttpClientFactory {
    public static HttpClient create() {
        var client = new HttpClient();
        client.init();
        return client;
    }
}
