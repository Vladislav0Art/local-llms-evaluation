package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();

        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");

        httpConnection.cookies(cookies);

        assertEquals("value1", httpConnection.request().cookies().get("cookie1"));
        assertEquals("value2", httpConnection.request().cookies().get("cookie2"));
    }

}