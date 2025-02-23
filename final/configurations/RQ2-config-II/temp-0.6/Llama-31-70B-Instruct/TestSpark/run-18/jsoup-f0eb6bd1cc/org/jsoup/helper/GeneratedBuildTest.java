package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URI;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com/path/to/page?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();

        assertEquals("https", result.getProtocol());
        assertEquals("www.example.com", result.getHost());
        assertEquals("/path/to/page", result.getPath());
        assertEquals("query=string", result.getQuery());
        assertEquals("fragment", result.getRef());
    }

}