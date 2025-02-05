package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        URL builtUrl = urlBuilder.build();

        assertNotNull(builtUrl);
        assertEquals(testUrl, builtUrl);
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");

        urlBuilder.appendKeyVal(keyVal);

        URL builtUrl = urlBuilder.build();

        assertNotNull(builtUrl);
        assertEquals("http://example.com?key=value", builtUrl.toString());
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "\uD83D\uDE00"); // unicode emoji - not supported in URL

        urlBuilder.appendKeyVal(keyVal);
    }

}