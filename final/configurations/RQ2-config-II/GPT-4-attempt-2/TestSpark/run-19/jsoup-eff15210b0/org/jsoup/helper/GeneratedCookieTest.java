package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        HttpConnection connection = new HttpConnection();
        String name = "cookieName";
        String value = "cookieValue";
        Connection result = connection.cookie(name, value);
        assertEquals(value, result.request().cookies().get(name));
    }

}