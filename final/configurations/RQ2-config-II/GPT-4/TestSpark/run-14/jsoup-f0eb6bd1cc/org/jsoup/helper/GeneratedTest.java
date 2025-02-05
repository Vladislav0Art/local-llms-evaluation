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
    public void urlBuilderConstructorTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void urlBuilderConstructorWithNullTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL outputUrl = urlBuilder.build();
            Assert.assertEquals(inputUrl, outputUrl);
        } catch (MalformedURLException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "val");
            urlBuilder.appendKeyVal(kv);
            URL outputUrl = urlBuilder.build();
            Assert.assertTrue(outputUrl.toString().endsWith("key=val"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void appendKeyValWithNullTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValWithUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\uD800");
        urlBuilder.appendKeyVal(kv);
    }

}