package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("https://example.com"));
    }

    @After
    public void tearDown() throws Exception {
        urlBuilder = null;
    }

    @Test
    public void testBuild() throws Exception {
        URL expectedUrl = new URL("https://example.com");
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}