package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestResponseWithoutProxy {

    @Test
    public void testResponseWithoutProxy() {
        HttpConnection connection = new HttpConnection();
        Response response = new org.jsoup.helper.Response(new Response());
        String url = "http://example.com";
        Connection result = connection.get(url, null);
        assertNotNull(result);
    }

}