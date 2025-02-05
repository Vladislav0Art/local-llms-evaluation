package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilder_NullInputUrlTest {

    @Test
    public void UrlBuilder_NullInputUrlTest() {
        try {
            new UrlBuilder(null);
            Assert.fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Input URL cannot be null", e.getMessage());
        }
    }

}