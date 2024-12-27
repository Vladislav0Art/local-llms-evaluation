package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.IOException;
import java.util.Map;

public class GeneratedUrl_String_ReturnsHttpConnection {

    @Test
    public void url_String_ReturnsHttpConnection() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        Connection httpConnection = connection.url("https://www.example.com");
        assertNotNull(httpConnection);
        assertEquals(HttpConnection.class, httpConnection.getClass());
    }

}