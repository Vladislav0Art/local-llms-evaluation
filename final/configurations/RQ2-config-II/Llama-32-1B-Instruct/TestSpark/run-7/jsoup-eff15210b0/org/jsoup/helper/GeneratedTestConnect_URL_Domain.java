package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnect_URL_Domain {

    @Test
    public void testConnect_URL_Domain() {
        HttpConnection connection = new HttpConnection();
        assertEquals("www.example.com", connection.url(new URL("http://example.com")).getHost());
        assertEquals("http://example.net", connection.url(new URL("http://example.com/path").getHost()));
    }

}