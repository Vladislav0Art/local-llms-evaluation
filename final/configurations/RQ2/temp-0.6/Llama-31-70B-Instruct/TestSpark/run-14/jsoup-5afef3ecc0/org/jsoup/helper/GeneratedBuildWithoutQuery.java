package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedBuildWithoutQuery {

    private UrlBuilder urlBuilder;
    private URL inputUrl;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("https://www.example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @After
    public void tearDown() {
        urlBuilder = null;
    }

    @Test
    public void buildWithoutQuery() throws MalformedURLException, URISyntaxException {
        URL expected = new URL("https://www.example.com");
        assertEquals(expected, urlBuilder.build());
    }

}