package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithNoQueryString {

    @Test
    public void buildUrlWithNoQueryString() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com/", result.toString());
    }

}