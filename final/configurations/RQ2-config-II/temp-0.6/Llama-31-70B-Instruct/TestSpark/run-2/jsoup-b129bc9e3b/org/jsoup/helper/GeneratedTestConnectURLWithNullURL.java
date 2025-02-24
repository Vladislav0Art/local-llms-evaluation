package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import static org.junit.Assert.*;

public class GeneratedTestConnectURLWithNullURL {

    private HttpConnection httpConnection;

    @Before
    public void initialize() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectURLWithNullURL() {
        try {
            HttpConnection connection = HttpConnection.connect((URL) null);
            fail("Null URL should throw an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}