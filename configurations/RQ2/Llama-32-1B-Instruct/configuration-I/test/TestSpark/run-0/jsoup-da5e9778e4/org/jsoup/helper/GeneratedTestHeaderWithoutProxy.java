package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestHeaderWithoutProxy {

    @Test
    public void testHeaderWithoutProxy() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("key", "value");
        connection.setHeader(null, headers);
        String url = "http://example.com";
        Connection response = connection.get(url, null);
        assertNotNull(response);
    }

}