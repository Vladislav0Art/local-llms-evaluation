package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void UrlBuilderCreationTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        assertNotNull(urlBuilder);
    }

    @Test
    public void buildUrlNoQueryNoRefTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("https://www.example.com", resultUrl.toString());
    }

    @Test
    public void buildUrlWithRefTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("https://www.example.com#ref", resultUrl.toString());
    }

    @Test
    public void decodePartTest() throws MalformedURLException {
        URL url = new URL("https://%F0%9F%92%A9.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("https://💩.com", resultUrl.toString());
    }

}