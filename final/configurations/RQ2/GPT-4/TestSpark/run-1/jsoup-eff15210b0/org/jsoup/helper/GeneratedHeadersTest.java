package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "text/html");
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.headers(headers);
        assertEquals(connection, httpConnection);
    }

}