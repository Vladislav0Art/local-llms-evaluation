package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestConnectWithIgnoreHttpErrors {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testConnectWithIgnoreHttpErrors() throws IOException, URISyntaxException {
        URL url = new URL("https://example.com");
        boolean ignoreHttpErrors = true;
        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(url, null);

        assertEquals(200, connection.getResponseCode());
    }

}