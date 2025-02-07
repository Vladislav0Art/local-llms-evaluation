package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_connect_no_exception {

    @Test
    public void test_connect_no_exception() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

}