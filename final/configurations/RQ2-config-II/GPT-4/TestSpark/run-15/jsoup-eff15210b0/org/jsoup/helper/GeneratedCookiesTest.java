package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        HashMap<String, String> cookies = new HashMap<>();
        cookies.put("key", "value");
        Connection conn = new HttpConnection().cookies(cookies);
        Assert.assertNotNull(conn);
    }

}