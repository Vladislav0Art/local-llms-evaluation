package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import static org.junit.Assert.*;

public class GeneratedTestURL {

    private HttpConnection httpConnection;

    @Before
    public void initialize() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testURL() {
        httpConnection.url("https://example.com");
        assertEquals("https://example.com", httpConnection.request().url().toString());
    }

}