package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest_referrer_no_exception {

    @Test
    public void test_referrer_no_exception() throws Exception {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertEquals("", connection - referrer());
    }

}