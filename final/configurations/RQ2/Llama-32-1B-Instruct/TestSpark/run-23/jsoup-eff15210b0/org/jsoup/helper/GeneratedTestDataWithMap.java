package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestDataWithMap {

    private String url = "http://example.com";

    @Test
    public void testDataWithMap() {
        HttpConnection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        Map<String, String> data = new LinkedHashMap<>();
        data.put("name", "John");
        data.put("age", "30");
        connection.data(key, value, data); // data method with map
    }

}