package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_ignore_http_errors_no_exception {

    @Test
    public void test_ignore_http_errors_no_exception() throws Exception {
        String url = "http://example.com";
        Connection connection = new HttpConnection();
        connection.ignoreHttpErrors(true);
        assertNotNull(connection.request());
    }

}