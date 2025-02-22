package org.jsoup.helper;

import static org.jsoup.helper.UrlBuilder.build;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public class GeneratedTest {

    @Mock
    UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.google.com/");
        when(urlBuilder.build()).thenReturn(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void buildTestURISyntaxException() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.google.com/");
        when(urlBuilder.build()).thenThrow(URISyntaxException.class);
        urlBuilder.build();
    }

    @Test
    public void buildTestMalformedURLException() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.google.com/");
        when(urlBuilder.build()).thenThrow(MalformedURLException.class);
        urlBuilder.build();
    }

}