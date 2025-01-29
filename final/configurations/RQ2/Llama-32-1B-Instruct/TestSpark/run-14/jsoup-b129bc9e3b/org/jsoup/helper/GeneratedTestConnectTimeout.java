package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectTimeout {

    @Test
    public void testConnectTimeout() {
        int timeout = 1000;
        HttpConnection connection = new HttpConnection(timeout);
        assertTrue(connection.timeout(timeout) == true);
        assertFalse(connection.timeout(timeout) == false);
    }

}