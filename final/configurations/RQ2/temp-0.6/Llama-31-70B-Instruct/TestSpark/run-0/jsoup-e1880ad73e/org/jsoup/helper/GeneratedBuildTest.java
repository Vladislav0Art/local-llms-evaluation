package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;

public class GeneratedBuildTest {

    UrlBuilder urlBuilder;
    URL url;

    @Before
    public void setUp() throws MalformedURLException {
        url = new URL("https://www.jsoup.org");
        urlBuilder = new UrlBuilder(url);
    }

    @After
    public void tearDown() {
        urlBuilder = null;
        url = null;
    }

    @Test
    public void buildTest() {
        URL actualUrl = urlBuilder.build();
        assertEquals(url, actualUrl);
    }

}