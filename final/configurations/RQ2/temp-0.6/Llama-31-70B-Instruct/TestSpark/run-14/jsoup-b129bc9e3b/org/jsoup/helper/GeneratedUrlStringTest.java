package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url("https://www.example.com");
        assertEquals("https://www.example.com", connection.getUrl().toString());
    }

}