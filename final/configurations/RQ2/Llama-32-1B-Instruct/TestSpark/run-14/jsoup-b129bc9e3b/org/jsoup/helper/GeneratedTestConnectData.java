package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectData {

    @Test
    public void testConnectData() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Map<String, String> headers = new HashMap<>();
        headers.put("header", "value");
        HttpConnection connection = new HttpConnection(data, headers);
        assertEquals(data, connection.data("key"));
    }

}