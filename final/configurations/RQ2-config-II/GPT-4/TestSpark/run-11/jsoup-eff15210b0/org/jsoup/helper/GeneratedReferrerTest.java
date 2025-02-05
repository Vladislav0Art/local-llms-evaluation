package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedReferrerTest {

    @Test
    public void referrerTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.referrer("http://referrer.com");
        Assert.assertEquals("http://referrer.com", connection.request().referrer());
    }

}