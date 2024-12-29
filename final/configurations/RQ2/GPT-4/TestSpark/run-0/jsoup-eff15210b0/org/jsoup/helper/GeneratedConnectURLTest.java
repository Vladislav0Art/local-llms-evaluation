package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.CookieStore;
import java.net.URL;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://www.google.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

}