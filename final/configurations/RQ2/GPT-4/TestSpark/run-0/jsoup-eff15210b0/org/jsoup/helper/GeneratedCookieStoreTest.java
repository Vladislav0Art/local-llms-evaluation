package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCookieStoreTest {

    @Test
    public void cookieStoreTest() {
        Connection connection = Jsoup.connect("http://www.google.com");
        connection.cookie("cookie-name", "cookie-value");
        Assert.assertEquals("cookie-value", connection.request().cookie("cookie-name"));
    }

}