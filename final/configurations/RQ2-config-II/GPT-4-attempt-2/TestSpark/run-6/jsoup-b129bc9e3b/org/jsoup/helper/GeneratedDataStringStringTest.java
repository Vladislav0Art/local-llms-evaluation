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

public class GeneratedDataStringStringTest {

    @Test
    public void dataStringStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value");

        assertEquals("value", httpConnection.request().data().get(0).value());
    }

}