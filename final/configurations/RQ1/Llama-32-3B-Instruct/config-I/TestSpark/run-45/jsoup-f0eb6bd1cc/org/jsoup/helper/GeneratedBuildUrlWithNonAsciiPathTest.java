package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlWithNonAsciiPathTest {

    @Test
    public void buildUrlWithNonAsciiPathTest() throws URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/path?query#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        URL result = builder.build();
        assertEquals("https%3A//example.com/utf-8%3Fpath%3Fquery%23fragment", result.toString());
    }

}