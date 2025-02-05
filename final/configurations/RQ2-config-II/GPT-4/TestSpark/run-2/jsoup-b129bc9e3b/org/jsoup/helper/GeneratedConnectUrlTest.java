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

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() throws IOException {
        Connection connection = HttpConnection.connect("https://www.example.com");
        Assert.assertEquals("https://www.example.com", connection.request().url().toString());
    }

}