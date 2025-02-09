package org.jsoup.helper;

import org.hamcrest.Matchers;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws IOException {
        URL url = new URL("http://www.google.com");
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        Assert.assertEquals(url, httpConnection.request().url());
    }

}