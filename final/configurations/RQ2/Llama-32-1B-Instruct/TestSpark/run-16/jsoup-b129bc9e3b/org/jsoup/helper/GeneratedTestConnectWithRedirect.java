package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestConnectWithRedirect {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testConnectWithRedirect() throws IOException, URISyntaxException, InterruptedException {
        URL url = new URL("https://example.com");
        String redirectUrl = "http://proxy.example.com";

        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(url, null);
        assertEquals(302, connection.getResponseCode());
        assertTrue(connection.getRedirectLocation().contains("http://proxy.example.com"));
    }

}