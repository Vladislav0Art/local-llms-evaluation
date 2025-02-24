package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTestUserAgent {

    @Test
    public void testUserAgent() {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla/5.0");
        assertEquals("Mozilla/5.0", connection.request().header("User-Agent"));
    }

}