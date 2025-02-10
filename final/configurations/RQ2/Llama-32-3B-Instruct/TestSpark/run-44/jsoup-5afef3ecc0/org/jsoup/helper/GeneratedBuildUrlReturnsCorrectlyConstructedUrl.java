package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedBuildUrlReturnsCorrectlyConstructedUrl {

    @Test
    public void buildUrlReturnsCorrectlyConstructedUrl() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path/to/resource"));
        String result = builder.build().toString();
        assertTrue(result.contains("https://example.com/"));
        assertTrue(result.contains("/path/to/resource"));
    }

}