package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnect_Proxy_0 {

    @Test
    public void testConnect_Proxy_0() {
        HttpConnection connection = new HttpConnection();
        assertEquals("http://example.com", connection.proxy(null));
    }

}