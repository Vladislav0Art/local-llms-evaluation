package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithResponse {

    @Test
    public void testConnectWithResponse() throws InterruptedException {
        URL url = new URL("http://example.com");
        HttpConnection connection = (HttpConnection) HttpConnection.connect(url);
        assertEquals(true, connection instanceof Connection);

        String response = connection.response().toString();

        assertEquals("HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n", response, "Unexpected response");
    }

}