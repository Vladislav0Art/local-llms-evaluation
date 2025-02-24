package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(1024);
        assertEquals(1024, connection.request().maxBodySize());
    }

}