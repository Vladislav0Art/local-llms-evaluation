package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void buildTestNoQueryNoRef() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
        assertEquals("http://www.google.com", result.toString());
    }

    @Test
    public void buildTestQueryNoRef() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com?test=query");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
        assertEquals("http://www.google.com?test=query", result.toString());
    }

    @Test
    public void buildTestRefNoQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com#test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
        assertEquals("http://www.google.com#test", result.toString());
    }

    @Test
    public void buildTestRefAndQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com?test=query#test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
        assertEquals("http://www.google.com?test=query#test", result.toString());
    }

    @Test
    public void buildTestInvalidURL() throws MalformedURLException {
        URL inputUrl = new URL("http::invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
    }

}