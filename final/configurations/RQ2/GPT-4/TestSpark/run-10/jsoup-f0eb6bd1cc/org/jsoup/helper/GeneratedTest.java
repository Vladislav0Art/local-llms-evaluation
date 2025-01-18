package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(urlBuilder.build(), inputUrl);
    }

    @Test
    public void UrlBuilderConstructorMalformedUrlExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("htp:/nonexistent.url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(urlBuilder.build(), inputUrl);
    }

}