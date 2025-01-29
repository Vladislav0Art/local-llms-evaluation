package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestConnectWithTimeout {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testConnectWithTimeout() throws IOException, URISyntaxException {
        URL url = new URL("https://example.com");
        int timeoutMillis = 1000;
        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(url, null);

        Thread.sleep(timeoutMillis);
        assertEquals(503, connection.getResponseCode());
    }

}