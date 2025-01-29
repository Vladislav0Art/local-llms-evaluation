package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectProxyUrl {

    @Test
    public void testConnectProxyUrl() {
        URI uri = new URI("https://www.example.com");
        HttpConnection connection = new HttpConnection(uri);
        assertEquals(proxy.getScheme(), connection.get().getScheme());
        assertEquals(proxy.getHost(), connection.get().getHost());
    }

}