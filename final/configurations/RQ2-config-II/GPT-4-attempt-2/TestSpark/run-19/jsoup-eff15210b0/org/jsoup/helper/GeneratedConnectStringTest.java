package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals("http://example.com", connection.request().url().toString());
    }

}