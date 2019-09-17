package pl.com.sages.beandemo.http;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MovieDownloader {
    private final HttpClient httpClient;
}
