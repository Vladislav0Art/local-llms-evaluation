package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        Connection connection = HttpConnection.connect("http://example.com").headers(headers);
        assertEquals("application/json", connection.request().headers().get("Content-Type"));
    }

}