package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        String url = "http://proxy.example.com:8080";
        HttpConnection connection = HttpConnection.connect(url, null);
        assertEquals(true, connection instanceof HttpConnection.Proxy);
    }

}