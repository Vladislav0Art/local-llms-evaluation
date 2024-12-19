package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestPostRequestWithBody {

    @Test
    public void testPostRequestWithBody() {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        request.POST("key", "value");
        String url = "http://example.com";
        Connection response = connection.post(url, request);
        assertNotNull(response);
    }

}