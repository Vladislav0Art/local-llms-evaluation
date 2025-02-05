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

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() throws IOException {
        String userAgent = "Mozilla";
        Connection connection = HttpConnection.connect("https://www.example.com").userAgent(userAgent);
        Assert.assertEquals(userAgent, connection.request().userAgent());
    }

}