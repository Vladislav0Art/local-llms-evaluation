package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        HttpConnection connection = new HttpConnection();
        connection.setProxy(new org.jsoup.helper.HttpProxy("192.168.1.100", 8080));
        String url = "http://example.com";
        connection.connect(url);
        assertNotNull(connection);
    }

}