package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithQueryStringAndAnchor {

    @Test
    public void buildUrlWithQueryStringAndAnchor() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/index.html?param=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com/index.html?param=value#anchor", result.toString());
    }

}