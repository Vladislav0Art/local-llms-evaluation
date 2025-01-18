package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://www.google.com");
        Map<String, String> headers = new HashMap<>();
        headers.put("key", "value");
        connection.headers(headers);
        Assert.assertEquals(connection.request().header("key"), "value");
    }

}