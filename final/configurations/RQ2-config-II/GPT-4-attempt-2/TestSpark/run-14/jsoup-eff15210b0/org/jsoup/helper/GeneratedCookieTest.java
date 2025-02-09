package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        HttpConnection conn = new HttpConnection();
        conn.cookie("name", "value");
        assertEquals("value", conn.request().cookie("name"));
    }

}