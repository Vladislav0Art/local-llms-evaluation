package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestTimeout {

    @Test
    public void testTimeout() {
        HttpConnection connection = HttpConnection.connect("https://example.com", 1000);
        assertEquals(false, connection.isAlive());
    }

}