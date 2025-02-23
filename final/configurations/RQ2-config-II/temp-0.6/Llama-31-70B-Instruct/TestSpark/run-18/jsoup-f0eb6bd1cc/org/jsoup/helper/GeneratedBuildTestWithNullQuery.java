package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URI;

public class GeneratedBuildTestWithNullQuery {

    @Test
    public void buildTestWithNullQuery() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com/path/to/page#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();

        assertEquals("https", result.getProtocol());
        assertEquals("www.example.com", result.getHost());
        assertEquals("/path/to/page", result.getPath());
        assertNull(result.getQuery());
        assertEquals("fragment", result.getRef());
    }

}