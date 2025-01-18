package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL validUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        URL invalidUrl = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(invalidUrl);
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}