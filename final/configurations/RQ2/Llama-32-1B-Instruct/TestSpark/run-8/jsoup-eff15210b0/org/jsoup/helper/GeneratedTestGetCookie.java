package org.jsoup.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetCookie {

    @Before
    public void setup() {
        // Initialize the CookieStore instance
        CookieStore cookieStore = new CookieManager();
    }

    @Test
    public void testGetCookie() throws Exception {
        String url = "https://www.example.com";
        Request request = new Request(url);
        Response response = new Response();

        // Add a session ID as a cookie
        request.addCookie(new Cookie("session_id", "12345"));

        // Send the request and get the cookies
        cookies = response.getCookies();
        String expectedValue = "12345";

        // Verify that the correct value was stored in the response
        if (!cookies.contains("session_id")) {
            throw new RuntimeException("Cookie 'session_id' not found in response");
        }

        // Verify that the correct value is returned from getCookie()
        assert expectedValue.equals(cookies.get("session_id"));
    }

}