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

public class GeneratedRequestBodyTest {

    @Test
    public void requestBodyTest() {
        String requestBody = "test request body";
        Connection conn = new HttpConnection().requestBody(requestBody);
        Assert.assertNotNull(conn);
    }

}