package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithAnchor {

    @Test
    public void buildUrlWithAnchor() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/index.html#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com/index.html#anchor", result.toString());
    }

}