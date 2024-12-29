package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertEquals(connection, connection.cookie("Test Cookie", "Test Value"));
    }

}