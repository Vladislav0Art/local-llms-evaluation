package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_max_body_size_no_exception {

    @Test
    public void test_max_body_size_no_exception() throws Exception {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertEquals(1024, connection.maxBodySize());
    }

}