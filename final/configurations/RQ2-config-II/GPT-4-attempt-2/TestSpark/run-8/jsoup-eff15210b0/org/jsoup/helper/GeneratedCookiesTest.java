package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");

        assertFalse(connection.request().hasCookie("cookie1"));
        assertFalse(connection.request().hasCookie("cookie2"));

        connection.cookies(cookies);

        assertTrue(connection.request().hasCookie("cookie1"));
        assertTrue(connection.request().hasCookie("cookie2"));
    }

}