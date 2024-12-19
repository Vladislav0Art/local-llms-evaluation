package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestEncodeUrl {

    @Test
    public void testEncodeUrl() {
        URL url = new URL("https://www.example.com");
        org.jsoup.helper.HttpConnection connection = new HttpConnection();
        connection.encodeUrl(url);
        assertEquals(new URL("https://www.example.com"), connection.getUrl());
    }

}