package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");
        assertTrue(connection.headers(headers) instanceof HttpConnection);
    }

}