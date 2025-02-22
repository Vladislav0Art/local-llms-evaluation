package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestBuild {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/path/to/page.html?param1=value1&param2=value2#fragment");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuild() throws URISyntaxException {
        URL normalizedUrl = urlBuilder.build();
        URI uri = new URI(normalizedUrl.toExternalForm());
        assertEquals("https", uri.getScheme());
        assertEquals("www.example.com", uri.getHost());
        assertEquals(-1, uri.getPort());
        assertEquals("/path/to/page.html", uri.getPath());
        assertEquals("param1=value1&param2=value2", uri.getQuery());
        assertEquals("fragment", uri.getFragment());
    }

}