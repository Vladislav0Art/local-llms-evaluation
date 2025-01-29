package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTestPostData {

    @Test
    public void testPostData() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        Connection.Request request = new Connection.Request(url);
        String[] data = {"key1", "value1"};
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("key1=value1", connection.request(request).postDataCharset("UTF-8"));
    }

}