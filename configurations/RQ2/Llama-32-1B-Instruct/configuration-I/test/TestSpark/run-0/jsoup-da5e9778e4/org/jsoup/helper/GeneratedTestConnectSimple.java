package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnectSimple {

    @Test
    public void testConnectSimple() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        connection.connect(url);
        assertNotNull(connection);
    }

}