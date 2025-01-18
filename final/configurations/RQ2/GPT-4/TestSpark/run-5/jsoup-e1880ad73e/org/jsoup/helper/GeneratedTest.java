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
    public void urlBuilder_ConstructWithNullUrl_ThrowsExceptionTest() {
        try {
            new UrlBuilder(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("inputUrl can't be null", ex.getMessage());
        }
    }

    @Test
    public void urlBuilder_ConstructWithValidUrlTest() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            // This wouldn't occur as the URL supplied is valid
        }
    }

    @Test
    public void build_WithValidInputUrl_Test() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            URL outputUrl = urlBuilder.build();

            Assert.assertNotNull(outputUrl);
            Assert.assertEquals(inputUrl, outputUrl);
        } catch (MalformedURLException e) {
            // This wouldn't occur as the URL supplied is valid
        }
    }

    @Test
    public void appendKeyVal_NullKeyVal_ThrowsExceptionTest() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            urlBuilder.appendKeyVal(null);

            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("kv can't be null", ex.getMessage());
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            Assert.fail("Expected IllegalArgumentException only");
        }
    }

    @Test
    public void appendKeyVal_NullKeyVal_ThrowsIllegalArgumentExceptionTest() throws UnsupportedEncodingException {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            urlBuilder.appendKeyVal(null);
        } catch (MalformedURLException e) {
            // This wouldn't occur as the URL supplied is valid
        }
    }

}