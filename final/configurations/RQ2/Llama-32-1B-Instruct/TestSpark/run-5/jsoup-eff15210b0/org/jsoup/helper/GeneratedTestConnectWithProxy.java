package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        HttpConnection connection = HttpConnection.connect(new URL("http://proxy.example.com"));
        assertEquals(true, connection.isAlive());
    }

}