package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;
import org.junit.Assert;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(mock(URL.class));
    }

    @After
    public void tearDown() {
        urlBuilder = null;
    }

    @Test
    public void testConstructor() {
        UrlBuilder urlBuilder = new UrlBuilder(mock(URL.class));
        assertNotNull(urlBuilder);
    }

    @Test
    public void testBuild() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        URL expectedUrl = new URL("http://www.example.com");

        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}