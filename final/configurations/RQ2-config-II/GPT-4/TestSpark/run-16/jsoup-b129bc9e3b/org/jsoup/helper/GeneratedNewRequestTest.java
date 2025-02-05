package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.newRequest();
        Assert.assertNotNull(connection);
    }

}