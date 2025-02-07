package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_connect_url_with_cookie {

    @Test
    public void test_connect_url_with_cookie() throws Exception {
        String url = "http://example.com?cookie=abc123";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection.cookieStore());
        assertSame("abc123", connection.cookieStore().getCookie("cookie"));
    }

}