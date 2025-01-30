package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTest {

    @Test
    public void build_NullQueryAndRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void build_NonNullQueryAndRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://google.com?query=value#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotEquals(inputUrl, outputUrl);
    }

    @Test
    public void build_InvalidProtocolTest() throws MalformedURLException {
        URL inputUrl = new URL("htt://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void UrlBuilder_ValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.u);
    }

}