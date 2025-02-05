package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("header-name-1", "header-value-1");
        headers.put("header-name-2", "header-value-2");

        Connection connection = new HttpConnection().headers(headers);
        assertNotNull(connection);
    }

}