package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedGetUrlTest {

    @Test
    public void getUrlTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(null, connection.getUrl());
    }

}