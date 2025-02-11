package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedBuild_WithQueryAndFragment_ReturnsNormalizedUrl {

    @Test
    public void build_WithQueryAndFragment_ReturnsNormalizedUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query=Hello%2C+World#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(new URL("http://example.com/path?query=Hello%2C%20World#fragment"), urlBuilder.build());
    }

}