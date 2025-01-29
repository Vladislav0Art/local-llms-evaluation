package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnect {

    private String url = "http://example.com";

    @Test
    public void testConnect() {
        HttpConnection connection = new HttpConnection();
        connection.connect(url);
        assertEquals("http://example.com", connection.getUrl());
    }

}