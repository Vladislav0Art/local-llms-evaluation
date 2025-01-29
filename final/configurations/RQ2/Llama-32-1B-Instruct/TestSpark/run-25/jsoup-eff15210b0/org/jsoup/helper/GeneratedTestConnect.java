package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection(url);
        assertEquals(url, connection.getUrl());
        assertEquals(DataUtil.UTF_8, connection.getRequestBody());
        assertEquals(null, connection.getHeader("Content-Type"));
    }

}