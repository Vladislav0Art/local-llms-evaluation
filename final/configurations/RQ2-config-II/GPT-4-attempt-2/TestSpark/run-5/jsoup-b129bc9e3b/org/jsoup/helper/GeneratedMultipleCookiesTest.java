package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedMultipleCookiesTest {

    @Test
    public void multipleCookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Connection connection = httpConnection.cookies(cookies);
        assertNotNull(connection);
    }

}