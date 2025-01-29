package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        HttpConnection connection = HttpConnection.connect("https://example.com");
        assertEquals(true, connection.isAlive());
    }

}