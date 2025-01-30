package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithQueryStringTest {

    @Test
    public void buildUrlWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com/query?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

}