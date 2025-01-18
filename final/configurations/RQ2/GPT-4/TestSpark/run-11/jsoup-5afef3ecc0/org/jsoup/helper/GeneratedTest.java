package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals(inputUrl, resultUrl);
    }

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);
        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);

        URL resultURL = urlBuilder.build();
        Assert.assertNotNull(resultURL);
        Assert.assertEquals(testURL.toString(), resultURL.toString());
    }

}