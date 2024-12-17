package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_decodePart_with_invalid_encoding]

Test {

    @Test
    public void [UrlBuilder_decodePart_with_invalid_encoding]Test() throws UnsupportedEncodingException {
        String input = "http://example.com/path?query=%3F%3F";
        assertEquals("??", UrlBuilder.decodePart(input));
    }

}