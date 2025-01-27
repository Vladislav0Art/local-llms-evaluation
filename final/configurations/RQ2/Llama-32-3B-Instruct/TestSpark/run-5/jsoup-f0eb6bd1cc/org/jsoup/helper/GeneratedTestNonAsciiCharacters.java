package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

public class GeneratedTestNonAsciiCharacters {

    @Test
    public void testNonAsciiCharacters() throws UnsupportedEncodingException {
        String url = "http://example.com?value=äöü";
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://example.com?value=%C3%A4%C3%B6%C3%BC", urlBuilder.appendKeyAndValue("key", urlBuilder.encode("äöü")));
    }

}