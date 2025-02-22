package org.jsoup.helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import java.util.Date;

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
    public void testBuild() throws URISyntaxException, MalformedURLException {
        URL inputUrl = mock(URL.class);
        when(inputUrl.getProtocol()).thenReturn("http");
        when(inputUrl.getHost()).thenReturn("localhost");
        when(inputUrl.getPath()).thenReturn("/test");
        when(inputUrl.getQuery()).thenReturn(null);
        when(inputUrl.getRef()).thenReturn(null);
        when(inputUrl.getUserInfo()).thenReturn(null);
        when(inputUrl.getPort()).thenReturn(-1);

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();

        assertEquals("http://localhost/test", result.toString());
    }

}