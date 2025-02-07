package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnect_URL_Suffixes {

    @Test
    public void testConnect_URL_Suffixes() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.url("http://example.com/path").getHost().equals("example.com"));
        assertTrue(connection.url("https://www.example.com/path").getHost().equals("www.example.com"));
    }

}