package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildWithNonAsciiCharactersTest() throws MalformedURLException {
        URL url = new URL("http://example.com/öäüß汉字");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/%C3%B6%C3%A4%C3%BC%C3%9F%E6%B1%89%E5%AD%97", newUrl.toString());
    }

    @Test
    public void buildWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://example.com/?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/?param=value", newUrl.toString());
    }

    @Test
    public void buildWithAnchorTest() throws MalformedURLException {
        URL url = new URL("http://example.com/#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/#anchor", newUrl.toString());
    }

    @Test
    public void appendKeyValToQueryStringTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.q.append("key=value");
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/?key=value", newUrl.toString());
    }

    @Test
    public void buildWithSpecialCharactersTest() throws MalformedURLException {
        URL url = new URL("http://example.com/?param=äüöß汉字");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/?param=%C3%A4%C3%BC%C3%B6%C3%9F%E6%B1%89%E5%AD%97", newUrl.toString());
    }

}