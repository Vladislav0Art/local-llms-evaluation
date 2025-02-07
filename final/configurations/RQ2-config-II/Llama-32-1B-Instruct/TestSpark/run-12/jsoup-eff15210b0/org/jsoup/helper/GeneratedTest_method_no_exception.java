package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_method_no_exception {

    @Test
    public void test_method_no_exception() throws Exception {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertSame("GET", connection.method(Method.GET));
    }

}