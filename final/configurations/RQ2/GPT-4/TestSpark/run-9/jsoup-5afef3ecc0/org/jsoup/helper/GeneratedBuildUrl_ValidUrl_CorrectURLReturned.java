package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildUrl_ValidUrl_CorrectURLReturned {

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