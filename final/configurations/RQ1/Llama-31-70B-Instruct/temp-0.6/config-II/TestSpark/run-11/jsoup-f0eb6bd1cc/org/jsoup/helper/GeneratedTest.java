package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Before
    public void setUp() {
        // Set up test fixture, if any.
    }

    @After
    public void tearDown() {
        // Tear down test fixture, if any.
    }

    @Test
    public void testUrlBuilderURL() {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.u);
    }

    @Test
    public void testUrlBuilderURLMalformedURLException() throws MalformedURLException {
        URL inputUrl = new URL("www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuild() throws URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actual = urlBuilder.build();
        assertEquals(inputUrl, actual);
    }

    @Test
    public void testBuildURISyntaxException() throws URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actual = urlBuilder.build();
    }

}