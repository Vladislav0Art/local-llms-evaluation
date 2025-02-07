package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnect_URL {

    @Test
    public void testConnect_URL() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.url(new URL("https://www.example.com")) != null);
        assertTrue(connection.url("https://www.example.com") != null);
    }

}