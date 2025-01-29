package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithHeader {

    @Test
    public void testConnectWithHeader() throws InterruptedException {
        URL url = new URL("http://example.com");
        HttpConnection connection = (HttpConnection) HttpConnection.connect(url);
        assertEquals(true, connection instanceof Connection);

        String header = connection.header("X-Example", "some-value");

        assertEquals("X-Example:some-value\r\n", header, "Unexpected header");
    }

}