package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestConnectWithMultipleCookies {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testConnectWithMultipleCookies() throws IOException, URISyntaxException, InterruptedException {
        URL url = new URL("https://example.com");
        String cookie1Name = "test_cookie";
        String cookie1Value = "test_value";
        String cookie2Name = "another_test_cookie";
        String cookie2Value = "another_test_value";

        CookieStore cookieStore = new CookieStore();
        CookieManager manager = new CookieManager(cookieStore);
        httpConnection.setCookieManager(manager);

        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(url, null);
        assertEquals(200, connection.getResponseCode());
    }

}