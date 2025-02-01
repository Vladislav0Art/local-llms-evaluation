package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com/?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/?q=test", urlBuilder.build().toString());
    }

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://www.google.com/#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/#fragment", urlBuilder.build().toString());
    }

    @Test
    public void buildWithNonAsciiTest() throws Exception {
        URL url = new URL("http://www.google.com/ú");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/%C3%BA", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://www.google.com/?key=value", urlBuilder.build().toString());
    }

    @Test
    public void decodePartTest() throws Exception {
        URL url = new URL("http://www.google.com/%C3%BA");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/ú", urlBuilder.build().toString());
    }

    @Test
    public void normalizeQueryTest() throws Exception {
        URL url = new URL("http://www.google.com/?q=test+query");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/?q=test+query", urlBuilder.build().toString());
    }

    @Test
    public void normalizeRefTest() throws Exception {
        URL url = new URL("http://www.google.com/#fragment part");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/#fragment%20part", urlBuilder.build().toString());
    }

}