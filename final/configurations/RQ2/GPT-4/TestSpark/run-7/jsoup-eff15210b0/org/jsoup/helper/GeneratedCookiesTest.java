package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCookiesTest {

    @Test
    public void cookiesTest() {
        Map<String, String> cookies = new HashMap<>();
        cookies.put("session", "randomsessionid");

        HttpConnection connection = new HttpConnection();
        connection.cookies(cookies);

        assertEquals("randomsessionid", connection.request().cookies().get("session"));
    }

}