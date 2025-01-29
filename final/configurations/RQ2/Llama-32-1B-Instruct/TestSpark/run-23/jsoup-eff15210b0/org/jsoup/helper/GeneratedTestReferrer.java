package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestReferrer {

    private String url = "http://example.com";

    @Test
    public void testReferrer() {
        HttpConnection connection = new HttpConnection();
        String referrer = "https://example.com";
        connection.referrer(referrer); // set referrer
        assertEquals("https://example.com", connection.getRequest().getHttpUrl());
    }

}