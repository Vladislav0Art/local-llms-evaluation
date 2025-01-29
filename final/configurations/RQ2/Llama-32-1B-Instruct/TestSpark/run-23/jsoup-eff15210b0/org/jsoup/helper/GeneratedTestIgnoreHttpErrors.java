package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestIgnoreHttpErrors {

    private String url = "http://example.com";

    @Test
    public void testIgnoreHttpErrors() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreHttpErrors(false); // ignore HTTP errors
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0, connection.getTimeoutMillis());
    }

}