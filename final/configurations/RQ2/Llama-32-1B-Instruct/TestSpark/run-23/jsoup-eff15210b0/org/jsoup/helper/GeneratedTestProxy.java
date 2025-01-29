package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestProxy {

    private String url = "http://example.com";

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection(new Proxy("localhost", 8080));
        connection.proxy(null); // no proxy provided
        assertEquals("https://localhost:8080", connection.getHttpUrl());
    }

}