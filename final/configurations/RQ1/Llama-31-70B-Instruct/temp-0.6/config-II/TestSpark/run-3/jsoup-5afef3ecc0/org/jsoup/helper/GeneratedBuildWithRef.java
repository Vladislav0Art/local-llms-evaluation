package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildWithRef {

    private URL inputUrl;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("http://example.com");
    }

    @Test
    public void buildWithRef() throws MalformedURLException, URISyntaxException {
        inputUrl = new URL("http://example.com#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();

        assertEquals("http://example.com#ref", url.toExternalForm());
    }

}