package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        URL url = urlBuilder.build();
        assertEquals("https", url.getProtocol());
        assertEquals("example.com", url.getHost());
        assertEquals(-1, url.getPort());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal("key=value");
        URL url = urlBuilder.build();
        assertEquals("https://example.com?key=value", url.toExternalForm());
    }

}