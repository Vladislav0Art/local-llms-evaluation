package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() {
        HttpConnection connection = HttpConnection.connect("https://example.com", false);
        assertEquals(false, connection.isAlive());
    }

}