package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTestIgnoreHttpErrors {

    @Test
    public void testIgnoreHttpErrors() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.setIgnoreHttpErrors(true);
        try {
            Thread.sleep(1500); // simulate a request taking longer than 1 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(false, connection.ignoreHttpErrors());
    }

}