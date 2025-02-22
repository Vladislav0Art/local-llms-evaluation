package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildReturnsUrlWithDecodedHostAndPath {

    @Test
    public void buildReturnsUrlWithDecodedHostAndPath() throws URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("http", "example.com", 80, "/some/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        URI expectedUri = new URI("http", null, "example.com", 80, "/some/path", null, null);
        assertEquals(expectedUri, resultUrl.toURI());
    }

}