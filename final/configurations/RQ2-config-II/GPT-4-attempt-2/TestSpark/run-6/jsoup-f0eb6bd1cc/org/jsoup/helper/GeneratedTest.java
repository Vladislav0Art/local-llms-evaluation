package org.jsoup.helper;

import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            fail("Construction of UrlBuilder failed with a MalformedURLException");
        }
    }

    @Test
    public void urlBuilderConstructorNullInputTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL buildUrl = urlBuilder.build();
            assertEquals(url.toString(), buildUrl.toString());
        } catch (MalformedURLException e) {
            fail("Building UrlBuilder failed with a MalformedURLException");
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(kv);
            URL buildUrl = urlBuilder.build();
            assertTrue(buildUrl.toString().contains("key=value"));
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            fail("Appending KeyVal to UrlBuilder failed with an exception");
        }
    }

    @Test
    public void appendKeyValNullInputTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.appendKeyVal(null);
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            fail("Appending KeyVal to UrlBuilder failed with an exception");
        }
    }

}