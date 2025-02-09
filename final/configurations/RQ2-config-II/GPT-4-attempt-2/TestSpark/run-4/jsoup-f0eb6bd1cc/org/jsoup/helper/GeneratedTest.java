package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderNullTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (MalformedURLException ex) {
            fail("Malformed URL");
        }
    }

    @Test
    public void UrlBuilderNullInputTest() {
        UrlBuilder builder = new UrlBuilder(null);
    }

    @Test
    public void buildBadUrlTest() throws MalformedURLException {
        URL url = new URL("http:/example.com.yy");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void buildValidUrlTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(url);
            URL result = builder.build();
            assertEquals(url, result);
        } catch (MalformedURLException ex) {
            fail("Malformed URL");
        }
    }

    @Test
    public void appendKeyValBadEncodingTest() throws UnsupportedEncodingException {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(url);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "val");
            builder.appendKeyVal(kv);
        } catch (MalformedURLException ex) {
            fail("Malformed URL");
        }
    }

}