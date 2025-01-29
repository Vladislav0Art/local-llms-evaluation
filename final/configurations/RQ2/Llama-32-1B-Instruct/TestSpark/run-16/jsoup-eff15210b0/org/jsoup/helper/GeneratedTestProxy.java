package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setProxy(new org.jsoup.parser.Proxy(url));
        String actualUrl = connection.proxy(url);
        assertEquals("https://proxy.example.com", actualUrl);
    }

}