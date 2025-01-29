package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTestUserAgent {

    @Test
    public void testUserAgent() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.37");
        String actualUrl = connection.url(url);
        assertEquals("https://www.example.com", actualUrl);
    }

}