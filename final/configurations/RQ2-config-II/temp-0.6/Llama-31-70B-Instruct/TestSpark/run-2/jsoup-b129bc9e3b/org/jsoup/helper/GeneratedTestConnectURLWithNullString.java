package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import static org.junit.Assert.*;

public class GeneratedTestConnectURLWithNullString {

    private HttpConnection httpConnection;

    @Before
    public void initialize() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectURLWithNullString() {
        try {
            HttpConnection connection = HttpConnection.connect((String) null);
            fail("Null string should throw an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}