package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildValidURLTest {

    @Test
    public void buildValidURLTest() {
        URL url = null;
        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            fail("Invalid URL provided for test");
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();
        assertEquals(url, resultUrl);
    }

}