package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTestTimeout {

    @Test
    public void testTimeout() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(1000);
        assertEquals(1000, connection.request().timeout());
    }

}