package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_connect_user_agent_no_exception {

    @Test
    public void test_connect_user_agent_no_exception() throws Exception {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Example User Agent");
        assertNotNull(connection.userAgent());
    }

}