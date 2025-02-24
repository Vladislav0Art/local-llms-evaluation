package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedSetUrlTest {

    @Test
    public void setUrlTest() {
        HttpConnection connection = new HttpConnection();
        connection.url("http://localhost");
        assertEquals("http://localhost", connection.getUrl());
    }

}