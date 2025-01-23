package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        URL url = new URL("https://www.example.com");
        connection.url(url);
        assertEquals(url, connection.request().url());
    }

}