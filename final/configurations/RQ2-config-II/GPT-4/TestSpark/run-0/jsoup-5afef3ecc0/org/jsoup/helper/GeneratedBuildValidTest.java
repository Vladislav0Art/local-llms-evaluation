package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildValidTest {

    // UrlBuilder instance creation test

    @Test
    public void buildValidTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        URL url = urlBuilder.build();
        assertEquals("http://www.google.com", url.toString());
    }

}