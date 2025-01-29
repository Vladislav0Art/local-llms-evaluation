package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        String url = "https://example.com";
        Proxy proxy = new com.google.http.HttpsProxy("localhost:8080");
        HttpConnection connection = new HttpConnection(proxy);
        assertEquals(url, connection.getUrl());
        assertEquals(DataUtil.UTF_8, connection.getRequestBody());
    }

}