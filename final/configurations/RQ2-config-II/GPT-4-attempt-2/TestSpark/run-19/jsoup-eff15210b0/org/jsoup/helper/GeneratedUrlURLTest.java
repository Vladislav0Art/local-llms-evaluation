package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url(new URL("http://example.com"));
        assertEquals("http://example.com", connection.request().url().toString());
    }

}