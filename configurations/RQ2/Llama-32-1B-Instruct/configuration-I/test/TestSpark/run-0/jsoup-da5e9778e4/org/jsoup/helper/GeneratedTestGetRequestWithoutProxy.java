package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestGetRequestWithoutProxy {

    @Test
    public void testGetRequestWithoutProxy() {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        String url = "http://example.com";
        Connection response = connection.get(url, request);
        assertNotNull(response);
    }

}