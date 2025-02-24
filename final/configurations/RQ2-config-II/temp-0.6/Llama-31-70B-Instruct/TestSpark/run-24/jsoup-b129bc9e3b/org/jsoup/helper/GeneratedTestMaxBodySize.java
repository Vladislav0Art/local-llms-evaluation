package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() {
        HttpConnection connection = new HttpConnection();
        int maxBodySize = 10000;
        connection.maxBodySize(maxBodySize);
        assertEquals(maxBodySize, connection.request().maxBodySize());
    }

}