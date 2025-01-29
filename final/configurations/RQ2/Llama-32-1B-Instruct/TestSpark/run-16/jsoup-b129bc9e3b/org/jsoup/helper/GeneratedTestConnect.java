package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestConnect {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testConnect() throws IOException, URISyntaxException, InterruptedException {
        URL url = new URL("https://example.com");
        String token = "test_token";
        CookieStore cookieStore = new CookieStore();
        CookieManager manager = new CookieManager(cookieStore);
        httpConnection.setCookieManager(manager);

        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(url, token);
        assertEquals(200, connection.getResponseCode());
    }

}