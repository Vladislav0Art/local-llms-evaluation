package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_connect_proxy_no_exception {

    @Test
    public void test_connect_proxy_no_exception() throws Exception {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setProxy(null);
        Connection proxyConnection = HttpConnection.connect(url);
        assertNotNull(proxyConnection);
    }

}