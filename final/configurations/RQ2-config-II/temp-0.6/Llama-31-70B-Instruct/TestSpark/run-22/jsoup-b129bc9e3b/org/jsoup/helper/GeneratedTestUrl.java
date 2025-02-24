package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTestUrl {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testUrl() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        HttpConnection updatedConnection = httpConnection.url(url);
        assertNotNull(updatedConnection);
    }

}