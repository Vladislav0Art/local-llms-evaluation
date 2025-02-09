package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() {
        URL url;
        try {
            url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException");
        }
    }

    @Test
    public void buildURLTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL outputUrl = urlBuilder.build();
            assertEquals(url, outputUrl);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException");
        }
    }

    @Test
    public void appendKeyValTest_UseInvalidEncoding() throws UnsupportedEncodingException {
        URL url;
        try {
            url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = Connection.KeyVal.create("\n", "value");
            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException");
        }
    }

    @Test
    public void appendKeyValTest_AppendValidEncoding() {
        URL url;
        try {
            url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(keyVal);
            URL outputUrl = urlBuilder.build();
            assertEquals(url + "?key=value", outputUrl.toString());
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

}