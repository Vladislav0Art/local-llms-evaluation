package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestIgnoreContentType {

    private String url = "http://example.com";

    @Test
    public void testIgnoreContentType() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreContentType(false); // ignore content type
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0, connection.getTimeoutMillis());
    }

}