package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection conn = new HttpConnection();
        conn.userAgent("Mozilla");
        assertEquals("Mozilla", conn.request().userAgent());
    }

}