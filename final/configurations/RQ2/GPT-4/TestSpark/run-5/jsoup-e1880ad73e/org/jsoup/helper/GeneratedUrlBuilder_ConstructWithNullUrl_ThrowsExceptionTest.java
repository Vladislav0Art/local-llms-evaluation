package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilder_ConstructWithNullUrl_ThrowsExceptionTest {

    @Test
    public void urlBuilder_ConstructWithNullUrl_ThrowsExceptionTest() {
        try {
            new UrlBuilder(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("inputUrl can't be null", ex.getMessage());
        }
    }

}