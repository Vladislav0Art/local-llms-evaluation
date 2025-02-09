package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws Exception {
        HttpConnection conn = new HttpConnection();
        conn.url(new URL("http://example.com"));
        assertEquals("http://example.com", conn.request().url().toString());
    }

}