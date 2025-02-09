package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectURLTest {

    // testing connect(String)

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://www.google.com");
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect(url);
        Assert.assertNotNull(httpConnection);
    }

}