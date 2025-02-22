package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com/path?q=query&k=val");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("https://example.com/path?q=query&k=val", outputUrl.toString());
    }

}