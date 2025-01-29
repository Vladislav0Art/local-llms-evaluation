package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestDataWithFilename {

    private String url = "http://example.com";

    @Test
    public void testDataWithFilename() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        String filename = "filename.txt";
        connection.data(key, value, filename); // data method with filename
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}