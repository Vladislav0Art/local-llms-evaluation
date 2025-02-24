package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTestUrl {

    @Test
    public void testUrl() {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com");
        assertEquals("http://example.com", connection.request().url().toString());
    }

}