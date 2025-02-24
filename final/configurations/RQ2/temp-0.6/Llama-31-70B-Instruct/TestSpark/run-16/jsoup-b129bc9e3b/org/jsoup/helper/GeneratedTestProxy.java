package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection();
        connection.proxy("127.0.0.1", 8080);
        assertEquals("127.0.0.1", connection.request().proxy().address().getHostName());
        assertEquals(8080, connection.request().proxy().address().getPort());
    }

}