package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectUrlTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectUrlWithProxyTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .proxy("127.0.0.1", 8080);
        assertNotNull(connection);
    }

    @Test
    public void connectUrlWithUserAgentTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        assertNotNull(connection);
    }

    @Test
    public void connectUrlWithTimeoutTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .timeout(10000);
        assertNotNull(connection);
    }

    @Test
    public void connectUrlWithMaxBodySizeTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .maxBodySize(1000000);
        assertNotNull(connection);
    }

    @Test
    public void connectUrlWithFollowRedirectsTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .followRedirects(true);
        assertNotNull(connection);
    }

}