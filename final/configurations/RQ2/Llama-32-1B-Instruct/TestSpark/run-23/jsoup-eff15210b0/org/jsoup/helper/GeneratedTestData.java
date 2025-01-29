package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestData {

    private String url = "http://example.com";

    @Test
    public void testData() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        connection.data(key, value); // data method
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}