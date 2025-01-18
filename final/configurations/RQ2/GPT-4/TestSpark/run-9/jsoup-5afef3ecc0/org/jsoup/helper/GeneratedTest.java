package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

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

    @Test
    public void UrlBuilderConstructor_NullUrl_ExceptionThrown() {
        UrlBuilder builder = new UrlBuilder(null);
    }

    @Test
    public void buildUrl_ValidUrl_CorrectURLReturned() {
        try {
            URL url = new URL("http://www.google.com");
            UrlBuilder builder = new UrlBuilder(url);
            URL builtURL = builder.build();
            Assert.assertEquals("http://www.google.com", builtURL.toString());
        } catch (MalformedURLException e) {
            Assert.fail("MalformedURLException should not have been thrown.");
        }
    }

}