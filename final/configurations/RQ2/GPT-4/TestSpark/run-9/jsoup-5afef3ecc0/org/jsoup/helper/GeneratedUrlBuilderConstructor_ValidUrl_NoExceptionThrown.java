package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructor_ValidUrl_NoExceptionThrown {

    @Test
    public void UrlBuilderConstructor_ValidUrl_NoExceptionThrown() {
        URL url;
        try {
            url = new URL("http://www.google.com");
            UrlBuilder builder = new UrlBuilder(url);
            Assert.assertNotNull(builder);
        } catch (MalformedURLException e) {
            Assert.fail("MalformedURLException should not have been thrown.");
        }
    }

}