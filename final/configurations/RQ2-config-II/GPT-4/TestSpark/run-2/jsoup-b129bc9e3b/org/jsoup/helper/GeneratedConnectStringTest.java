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

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() throws IOException {
        String url = "https://www.example.com";
        Connection connection = HttpConnection.connect(url);
        Assert.assertEquals(url, connection.request().url().toString());
    }

}