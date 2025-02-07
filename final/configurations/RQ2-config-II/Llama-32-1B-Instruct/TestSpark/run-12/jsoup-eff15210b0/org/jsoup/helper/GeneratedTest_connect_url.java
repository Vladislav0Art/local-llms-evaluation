package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_connect_url {

    @Test
    public void test_connect_url() throws Exception {
        String url = "https://www.example.com";
        Connection connection = HttpConnection.connect(url);
        assertSame(url, connection.url());
    }

}