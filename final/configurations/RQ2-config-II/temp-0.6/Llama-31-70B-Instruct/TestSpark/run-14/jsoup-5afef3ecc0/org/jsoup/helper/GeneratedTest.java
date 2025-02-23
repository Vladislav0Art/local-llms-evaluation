package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        assertNotNull(urlBuilder.build());
        assertEquals("http://www.example.com", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("one", "two"));
        assertNotNull(urlBuilder.q);
        assertEquals("one=two", urlBuilder.q.toString());
    }

    @Test
    public void appendKeyValTest2() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("one", "two"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("three", "four"));
        assertNotNull(urlBuilder.q);
        assertEquals("one=two&three=four", urlBuilder.q.toString());
    }

    @Test
    public void appendKeyValTest3() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("one", "two"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("three", "four"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("five", "six"));
        assertNotNull(urlBuilder.q);
        assertEquals("one=two&three=four&five=six", urlBuilder.q.toString());
    }

}