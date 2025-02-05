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

public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        Connection connection = new HttpConnection();
        connection.cookie("name", "value");
        Assert.assertEquals("value", connection.request().cookie("name"));
    }

}