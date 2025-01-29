package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestMaxBodySize {

    private String url = "http://example.com";

    @Test
    public void testMaxBodySize() {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(1024); // 1KB max body size
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1024, connection.getMaxRequestBodySize());
    }

}