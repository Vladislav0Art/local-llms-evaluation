package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTestConstructWithScheme {

    @Test
    public void testConstructWithScheme() {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.appendToAscii("https://");
        urlBuilder.appendToAscii("example.com");
        URI uri = URI.create(urlBuilder.url.toString());
        assertEquals(URI.create("https://example.com"), uri);
    }

}