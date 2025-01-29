package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectUserAgent {

    @Test
    public void testConnectUserAgent() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
        HttpConnection connection = new HttpConnection();
        assertEquals(userAgent, connection.getUserAgent());
    }

}