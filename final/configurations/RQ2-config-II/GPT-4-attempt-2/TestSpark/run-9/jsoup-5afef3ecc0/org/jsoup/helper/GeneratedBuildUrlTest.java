package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, resultUrl);
    }

}