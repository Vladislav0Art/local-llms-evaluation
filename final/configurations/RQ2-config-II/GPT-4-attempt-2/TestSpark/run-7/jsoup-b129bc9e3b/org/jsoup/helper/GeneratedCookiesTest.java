package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        Map<String, String> mapCookies = new HashMap<>();
        mapCookies.put("cookie1", "value1");
        mapCookies.put("cookie2", "value2");
        Assert.assertNotNull(new HttpConnection().cookies(mapCookies));
    }

}