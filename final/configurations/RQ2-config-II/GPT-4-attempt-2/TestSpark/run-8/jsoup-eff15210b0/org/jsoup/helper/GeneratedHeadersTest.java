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

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept-Language", "en-US");
        headers.put("Content-Type", "application/json");
        assertFalse(connection.request().hasHeader("Accept-Language"));
        assertFalse(connection.request().hasHeader("Content-Type"));
        connection.headers(headers);
        assertTrue(connection.request().hasHeader("Accept-Language"));
        assertTrue(connection.request().hasHeader("Content-Type"));
    }

}