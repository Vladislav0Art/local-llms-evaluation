package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import static org.junit.Assert.*;

public class GeneratedTestConnectURL {

    private HttpConnection httpConnection;

    @Before
    public void initialize() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectURL() {
        HttpConnection connection = HttpConnection.connect("https://example.com");
        assertNotNull(connection);
    }

}