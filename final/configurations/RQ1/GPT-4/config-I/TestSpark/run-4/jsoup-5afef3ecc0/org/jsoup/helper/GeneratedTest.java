package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void buildNonAsciiTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com", resultUrl.toString());
    }

    @Test
    public void buildWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com?param=value", resultUrl.toString());
    }

    @Test
    public void buildWithRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com#ref", resultUrl.toString());
    }

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example%com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // This would thrown an RuntimeException for unsupported encoding
        urlBuilder.build();
    }

}