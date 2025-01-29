package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestTimeout {

    private String url = "http://example.com";

    @Test
    public void testTimeout() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(1000); // 1 second timeout
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(0, connection.getTimeoutMillis());
    }

}