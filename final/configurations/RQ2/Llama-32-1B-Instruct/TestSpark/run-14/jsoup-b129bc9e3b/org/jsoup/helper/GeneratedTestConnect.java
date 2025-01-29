package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String url = "https://www.example.com";
        HttpConnection connection = new HttpConnection();
        assertEquals(url, connection.connect(url));
        assertTrue(connection != null);
    }

}