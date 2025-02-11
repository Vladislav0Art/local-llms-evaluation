package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedBuild_WithQuery_ReturnsNormalizedUrl {

    @Test
    public void build_WithQuery_ReturnsNormalizedUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query=Hello%2C+World");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(new URL("http://example.com/path?query=Hello%2C%20World"), urlBuilder.build());
    }

}