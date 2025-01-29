package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestConnectWithMaxBodySize {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testConnectWithMaxBodySize() throws IOException, URISyntaxException {
        URL url = new URL("https://example.com");
        int maxRequestBodySize = 1024 * 10;
        httpConnection.setMaxRequestBodySize(maxRequestBodySize);

        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(url, null);
        assertEquals(200, connection.getResponseCode());
    }

}