package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection();
        connection.proxy("192.168.1.1", 8080);
        assertEquals(new InetSocketAddress("192.168.1.1", 8080), connection.proxy());
    }

}