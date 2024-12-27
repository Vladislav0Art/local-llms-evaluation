package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        String url = "http://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.url(url);
        assertEquals(url, connection.request().url().toString());
    }

}