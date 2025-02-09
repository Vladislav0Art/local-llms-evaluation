package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertEquals("http://example.com", connection.request().url().toString());
    }

}