package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithResponseKeyvals {

    @Test
    public void testConnectWithResponseKeyvals() throws InterruptedException {
        URL url = new URL("http://example.com");
        HttpConnection connection = (HttpConnection) HttpConnection.connect(url);
        assertEquals(true, connection instanceof Connection);

        String response = connection.response().toString();

        assertEquals("{\"key\":\"value\"}", response, "Unexpected response");
    }

}