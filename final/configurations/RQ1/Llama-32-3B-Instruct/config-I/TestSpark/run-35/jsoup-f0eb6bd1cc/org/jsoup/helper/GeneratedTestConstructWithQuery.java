package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTestConstructWithQuery {

    @Test
    public void testConstructWithQuery() {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.appendToAscii("https://");
        urlBuilder.appendToAscii("example.com?");
        urlBuilder.appendToAscii("param=value");
        URI uri = URI.create(urlBuilder.url.toString());
        assertEquals(URI.create("https://example.com?param=value"), uri);
    }

}