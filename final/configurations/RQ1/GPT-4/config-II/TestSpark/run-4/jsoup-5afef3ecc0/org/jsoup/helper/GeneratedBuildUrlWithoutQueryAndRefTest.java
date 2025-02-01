package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithoutQueryAndRefTest {

    @Test
    public void buildUrlWithoutQueryAndRefTest() throws MalformedURLException {
        String urlStr = "http://www.example.com";
        UrlBuilder builder = new UrlBuilder(new URL(urlStr));
        URL url = builder.build();

        assertEquals(urlStr, url.toString());
    }

}