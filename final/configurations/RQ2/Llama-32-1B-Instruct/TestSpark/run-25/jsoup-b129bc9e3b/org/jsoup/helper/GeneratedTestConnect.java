package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String url = "http://example.com";
        HttpConnection connection = HttpConnection.connect(url);
        assertEquals(true, connection instanceof Connection);
    }

}