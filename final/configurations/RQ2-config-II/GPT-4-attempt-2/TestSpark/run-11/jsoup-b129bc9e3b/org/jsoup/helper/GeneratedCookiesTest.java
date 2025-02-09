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

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("username", "user1");
        Connection connection = httpConnection.cookies(cookies);
        Assert.assertNotNull(connection);
    }

}