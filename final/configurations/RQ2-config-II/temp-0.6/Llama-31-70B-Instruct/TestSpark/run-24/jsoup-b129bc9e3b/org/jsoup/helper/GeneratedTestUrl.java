package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestUrl {

    @Test
    public void testUrl() {
        HttpConnection connection = new HttpConnection();
        String url = "https://www.example.com";
        connection.url(url);
        assertEquals(url, connection.request().url().toString());
    }

}