package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.helper.UrlBuilder;

public class GeneratedTest {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com:8080/path/to/file?key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://xn--example-hva.com:8080/path/to/file?key=value#anchor");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com:8080/path/to/file?key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal("key2", "value2");
        URL expectedUrl = new URL("http://xn--example-hva.com:8080/path/to/file?key=value&key2=value2#anchor");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}