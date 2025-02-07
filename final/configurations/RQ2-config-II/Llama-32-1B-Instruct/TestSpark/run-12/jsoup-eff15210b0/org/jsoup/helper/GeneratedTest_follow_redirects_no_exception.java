package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_follow_redirects_no_exception {

    @Test
    public void test_follow_redirects_no_exception() throws Exception {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        connection.followRedirects(true);
        assertSame("https://www.example.com", connection.url());
    }

}