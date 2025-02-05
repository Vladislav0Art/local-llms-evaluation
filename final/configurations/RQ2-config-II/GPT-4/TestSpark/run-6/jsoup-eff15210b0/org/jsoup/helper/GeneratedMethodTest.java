package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedMethodTest {

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.method(Connection.Method.GET);

        Assert.assertNotNull(connection);
    }

}