package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection.KeyVal;

public class GeneratedBuildUrlWithSpacesTest {

    @Test
    public void buildUrlWithSpacesTest() throws Exception {
        URL url = new URL("http://www.google.com/search?q=search term");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://www.google.com/search?q=search%20term", result.toString());
    }

}