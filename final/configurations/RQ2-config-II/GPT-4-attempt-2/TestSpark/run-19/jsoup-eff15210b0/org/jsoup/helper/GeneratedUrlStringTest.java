package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url("http://example.com");
        assertEquals("http://example.com", connection.request().url().toString());
    }

}