package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URI;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedBuildWithMalformedUrlTest {

    @Test
    public void buildWithMalformedUrlTest() throws URISyntaxException, MalformedURLException {
        URL malformedUrl = new URL("https://example.com%");
        UrlBuilder builder = new UrlBuilder(malformedUrl);
        URL actualUrl = builder.build();
        assertEquals(malformedUrl, actualUrl);
    }

}