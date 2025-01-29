package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithKeyvals {

    @Test
    public void testConnectWithKeyvals() throws InterruptedException {
        URL url = new URL("http://example.com");
        HttpConnection connection = (HttpConnection) HttpConnection.connect(url);
        assertEquals(true, connection instanceof Connection);

        String[] keyvals = {"key1", "value1"};

        for (String keyval : keyvals) {
            connection.data(keyval);
        }

        assertEquals(2, connection.request().keys().size(), "Unexpected number of key-value pairs");

        Thread.sleep(5000);

        String response = connection.response().toString();

        assertEquals("{\"key1\":\"value1\"}", response, "Unexpected response");
    }

}