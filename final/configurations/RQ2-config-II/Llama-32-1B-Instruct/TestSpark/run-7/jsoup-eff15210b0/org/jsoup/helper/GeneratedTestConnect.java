package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        assertNotSame(null, HttpConnection.connect("http://example.com"));
        HttpConnection connection = new HttpConnection();
        assertEquals("http://example.com", connection.connect("http://example.com"));
    }

}