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

public class GeneratedBuildWithNormalUrlTest {

    @Test
    public void buildWithNormalUrlTest() throws URISyntaxException, MalformedURLException {
        URL normalUrl = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(normalUrl);
        URL actualUrl = builder.build();
        assertEquals(normalUrl, actualUrl);
    }

}