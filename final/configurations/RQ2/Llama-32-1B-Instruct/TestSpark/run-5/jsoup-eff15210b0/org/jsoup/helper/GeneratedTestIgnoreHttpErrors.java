package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestIgnoreHttpErrors {

    @Test
    public void testIgnoreHttpErrors() {
        HttpConnection connection = HttpConnection.connect("https://example.com");
        assertEquals(true, connection.isAlive());
    }

}