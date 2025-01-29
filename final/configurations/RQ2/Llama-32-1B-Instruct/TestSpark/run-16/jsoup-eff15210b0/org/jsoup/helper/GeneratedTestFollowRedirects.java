package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setFollowRedirects(true);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, connection.followRedirects());
    }

}