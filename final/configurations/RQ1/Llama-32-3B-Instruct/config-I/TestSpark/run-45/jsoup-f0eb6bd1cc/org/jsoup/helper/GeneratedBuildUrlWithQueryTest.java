package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() throws URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/path?query=abc&def=e");
        UrlBuilder builder = new UrlBuilder(u);
        URL result = builder.build();
        assertEquals("https%3A//example.com/utf-8%3Fpath%3Fquery=abc%26def=e", result.toString());
    }

}