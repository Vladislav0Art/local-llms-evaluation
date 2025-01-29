package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestPostDataCharset {

    private String url = "http://example.com";

    @Test
    public void testPostDataCharset() {
        HttpConnection connection = new HttpConnection();
        String charset = "UTF-8";
        connection.postDataCharset(charset); // post data charset
    }

}