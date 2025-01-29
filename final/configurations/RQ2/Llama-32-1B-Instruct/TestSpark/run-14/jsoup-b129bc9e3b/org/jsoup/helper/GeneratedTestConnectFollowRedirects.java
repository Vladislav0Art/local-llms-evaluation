package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectFollowRedirects {

    @Test
    public void testConnectFollowRedirects() {
        boolean followRedirects = true;
        HttpConnection connection = new HttpConnection(followRedirects);
        assertTrue(connection.followRedirects(followRedirects) == true);
        assertFalse(connection.followRedirects(followRedirects) == false);
    }

}