package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnectWithUserAgent {

    @Test
    public void testConnectWithUserAgent() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        assertEquals(null, connection.getUserAgent());
    }

}