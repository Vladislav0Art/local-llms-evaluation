package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuild_InvalidURLTest {

    @Test
    public void build_InvalidURLTest() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            URL resultURL = urlBuilder.build();
            Assert.fail("Expected exception to be thrown");
        } catch (IllegalArgumentException iae) {
            Assert.assertEquals("URL cannot be null", iae.getMessage());
        }
    }

}