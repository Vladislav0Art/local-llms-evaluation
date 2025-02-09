package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Parser;
import org.junit.Test;

import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookie("name", "value");

        assertEquals("value", httpConnection.request().cookies().get("name"));
    }

}