package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() {
        HttpConnection connection = HttpConnection.connect("https://example.com");
        assertEquals(true, connection.isAlive());
    }

}