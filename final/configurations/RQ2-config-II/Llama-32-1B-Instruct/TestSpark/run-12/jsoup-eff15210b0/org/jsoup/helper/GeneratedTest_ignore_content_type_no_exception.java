package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_ignore_content_type_no_exception {

    @Test
    public void test_ignore_content_type_no_exception() throws Exception {
        String url = "http://example.com";
        Connection connection = new HttpConnection();
        connection ignoringContentType (false);
        assertNotNull(connection.request());
    }

}