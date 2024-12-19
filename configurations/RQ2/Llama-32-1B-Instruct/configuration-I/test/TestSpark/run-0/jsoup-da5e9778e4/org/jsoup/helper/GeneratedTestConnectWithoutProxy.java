package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnectWithoutProxy {

    @Test
    public void testConnectWithoutProxy() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        connection.connect(url);
        assertNotNull(connection);
    }

}