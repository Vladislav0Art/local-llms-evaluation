package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_post_data_charsets {

    @Test
    public void test_post_data_charsets() throws Exception {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection.postDataCharset("utf-8"));
    }

}