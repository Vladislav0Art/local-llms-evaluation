package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestUrl {

    @Test
    public void testUrl() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        URL url = new URL("http://example.com");
        httpConnection.url(url);
        assertEquals(url, httpConnection.request().url());
    }

}