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

public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://www.google.com");
        String name = "test-cookie";
        String value = "test-value";
        connection.cookie(name, value);
        Assert.assertEquals(connection.request().cookies().get(name), value);
    }

}