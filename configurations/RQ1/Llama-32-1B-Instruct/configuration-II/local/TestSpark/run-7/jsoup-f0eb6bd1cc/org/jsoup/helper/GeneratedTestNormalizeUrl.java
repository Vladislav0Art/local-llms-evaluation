package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTestNormalizeUrl {

    private UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor"));

    @Test
    public void testNormalizeUrl() {
        URL normalizedUrl = urlBuilder.build();
        assertEquals("https://example.com/path?query=value#anchor", normalizedUrl.toString());
    }

}