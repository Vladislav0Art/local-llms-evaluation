package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestNormalizeRef {

    private URL inputUrl;
    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("https://www.example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testNormalizeRef() {
        String normalized = UrlBuilder.normalizeRef("test ref");
        assertEquals("test%20ref", normalized);
    }

}