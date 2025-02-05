package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderConstructorValidUrlTest {

    // UrlBuilder instance creation test

    @Test
    public void urlBuilderConstructorValidUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        assertEquals(urlBuilder.getClass(), UrlBuilder.class);
    }

}