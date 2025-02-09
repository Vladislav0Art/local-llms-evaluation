package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://example.com", urlBuilder.build().toString());
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void UrlBuilderBuildTest() throws MalformedURLException {
        // test can also be similar to the UrlBuilderConstructorValidUrlTest
        // the implementation is not available to generate a different test
    }

    @Test
    public void appendKeyValNullArgTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void appendKeyValEmptyArgTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.create("", "");
        urlBuilder.appendKeyVal(kv);
        // the exact assertion can't be given without implementation details
    }

    @Test
    public void appendKeyValValidArgTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        // the exact assertion can't be given without implementation details
    }

}