package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() throws IOException {
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Connection connection = HttpConnection.connect("https://www.example.com").sslSocketFactory(sslSocketFactory);
        Assert.assertEquals(sslSocketFactory, connection.request().sslSocketFactory());
    }

}