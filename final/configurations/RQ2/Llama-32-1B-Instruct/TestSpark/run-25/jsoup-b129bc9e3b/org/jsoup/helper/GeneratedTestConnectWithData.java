package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithData {

    @Test
    public void testConnectWithData() throws InterruptedException {
        URL url = new URL("http://example.com");
        HttpConnection connection = (HttpConnection) HttpConnection.connect(url);
        assertEquals(true, connection instanceof Connection);

        String data = "{\"key\":\"value\"}";

        connection.data(data);
        assertEquals(true, data instanceof String, "Unexpected response");

        Thread.sleep(5000);

        String response = connection.response().toString();

        assertEquals("{\"key\":\"value\"}", response, "Unexpected response");
    }

}