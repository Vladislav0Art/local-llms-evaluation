package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedBuildUrlWithQueryStringTest {

    @Test
    public void buildUrlWithQueryStringTest() {
        URL url = new URL("https://example.com/path?query=foo&bar=1");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("?query=foo%26bar=1", result.getQuery());
    }

}