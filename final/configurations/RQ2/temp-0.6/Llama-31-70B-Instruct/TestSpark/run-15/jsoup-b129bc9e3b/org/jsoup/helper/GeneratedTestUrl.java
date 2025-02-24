package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestUrl {

    @Test
    public void testUrl() {
        HttpConnection connection = new HttpConnection();
        connection.url("https://www.google.com");
        assertEquals("https://www.google.com", connection.url());
    }

}