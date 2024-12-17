package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_decodePart]

Test {

    @Test
    public void [UrlBuilder_decodePart]Test() throws UnsupportedEncodingException {
        String input = "http://example.com/path?query=Hello World";
        assertEquals(input, UrlBuilder.decodePart(input));
    }

}