package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedBuildNormalizedUrlTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = Mockito.mock(UrlBuilder.class);
    }

    @Test
    public void buildNormalizedUrlTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com");
        URL expectedUrl = new URL("https://www.example.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}