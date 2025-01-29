package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestFollowRedirects {

    private String url = "http://example.com";

    @Test
    public void testFollowRedirects() {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(true); // follow redirects
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(2, connection.getFollowRedirects());
    }

}