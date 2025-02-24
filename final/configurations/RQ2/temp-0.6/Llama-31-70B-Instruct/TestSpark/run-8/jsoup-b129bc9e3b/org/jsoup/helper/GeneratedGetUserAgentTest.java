package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedGetUserAgentTest {

    @Test
    public void getUserAgentTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(null, connection.getUserAgent());
    }

}