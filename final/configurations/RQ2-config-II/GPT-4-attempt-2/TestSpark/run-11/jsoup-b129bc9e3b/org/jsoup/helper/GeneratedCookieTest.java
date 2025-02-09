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

public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.cookie("username", "user1");
        Assert.assertNotNull(connection);
    }

}