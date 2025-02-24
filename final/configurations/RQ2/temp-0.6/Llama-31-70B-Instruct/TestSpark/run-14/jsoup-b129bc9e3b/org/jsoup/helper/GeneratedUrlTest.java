package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        URL url = new URL("https://www.example.com");
        connection.url(url);
        assertEquals("https://www.example.com", connection.getUrl().toString());
    }

}