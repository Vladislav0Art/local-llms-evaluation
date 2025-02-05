package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilder_NullInputUrlTest() {
        try {
            new UrlBuilder(null);
            Assert.fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Input URL cannot be null", e.getMessage());
        }
    }

    @Test
    public void UrlBuilder_ValidInputUrlTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertEquals(url, urlBuilder.build());
        } catch (MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void build_BuilderWithNoAppendTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertEquals(url, urlBuilder.build());
        } catch (MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void appendKeyVal_NullInputKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.appendKeyVal(null);
            Assert.fail("Expected an IllegalArgumentException to be thrown");
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            Assert.assertEquals("KeyVal cannot be null", e.getMessage());
        } catch (MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void appendKeyVal_ValidInputKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(keyVal.key()).thenReturn("key");
            Mockito.when(keyVal.value()).thenReturn("value");

            urlBuilder.appendKeyVal(keyVal);

            Assert.assertEquals("http://example.com?key=value", urlBuilder.build().toString());
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

}