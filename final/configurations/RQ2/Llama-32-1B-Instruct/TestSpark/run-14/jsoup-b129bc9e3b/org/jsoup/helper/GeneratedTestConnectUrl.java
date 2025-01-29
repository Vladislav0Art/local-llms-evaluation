package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectUrl {

    @Test
    public void testConnectUrl() {
        URI uri = new URI("https://www.example.com");
        HttpConnection connection = new HttpConnection(uri);
        assertEquals(uri.getScheme(), connection.get().getScheme());
        assertEquals(uri.getHost(), connection.get().getHost());
        assertTrue(connection != null);
    }

}