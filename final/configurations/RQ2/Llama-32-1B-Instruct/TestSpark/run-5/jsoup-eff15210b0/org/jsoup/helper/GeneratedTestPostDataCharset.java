package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestPostDataCharset {

    @Test
    public void testPostDataCharset() {
        HttpConnection connection = HttpConnection.post("https://example.com", "POST", "application/json");
        assertEquals(true, connection.isAlive());
    }

}