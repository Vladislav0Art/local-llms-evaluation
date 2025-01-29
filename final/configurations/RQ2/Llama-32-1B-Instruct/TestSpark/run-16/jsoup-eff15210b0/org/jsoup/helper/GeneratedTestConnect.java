package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String url = "https://www.example.com";
        HttpConnection connection = HttpConnection.connect(url);
        assertEquals("https://www.example.com", connection.url());
    }

}