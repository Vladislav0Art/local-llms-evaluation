package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlUrlTest {

    @Test
    public void urlUrlTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.url(new URL("http://www.example.com"));
        Assert.assertNotNull(connectionResult);
    }

}