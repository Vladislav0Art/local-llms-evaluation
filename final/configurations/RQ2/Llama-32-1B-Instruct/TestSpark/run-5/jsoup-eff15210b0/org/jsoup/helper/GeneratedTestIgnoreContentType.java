package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestIgnoreContentType {

    @Test
    public void testIgnoreContentType() {
        HttpConnection connection = HttpConnection.connect("https://example.com", false);
        assertEquals(false, connection.isAlive());
    }

}