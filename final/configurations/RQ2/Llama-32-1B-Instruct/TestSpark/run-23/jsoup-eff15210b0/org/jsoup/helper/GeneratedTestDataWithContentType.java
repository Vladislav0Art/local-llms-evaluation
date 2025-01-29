package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestDataWithContentType {

    private String url = "http://example.com";

    @Test
    public void testDataWithContentType() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        String contentType = "text/plain";
        connection.data(key, value, contentType); // data method with content type
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}