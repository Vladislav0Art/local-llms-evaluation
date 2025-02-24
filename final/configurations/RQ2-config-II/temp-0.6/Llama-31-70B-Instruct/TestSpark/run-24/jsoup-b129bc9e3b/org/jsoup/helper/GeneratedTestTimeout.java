package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTimeout {

    @Test
    public void testTimeout() {
        HttpConnection connection = new HttpConnection();
        int timeout = 10000;
        connection.timeout(timeout);
        assertEquals(timeout, connection.request().timeout());
    }

}