package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "text/html");
        Connection connection = httpConnection.headers(headers);
        Assert.assertNotNull(connection);
    }

}