package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        HttpConnection connection = new HttpConnection();
        URL url = Mockito.mock(URL.class);
        when(url.toString()).thenReturn("https://www.example.com");
        connection.url(url);
        assertEquals("https://www.example.com", connection.request().url().toString());
    }

}