package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedUrlBuilderConstructorValidUrlTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://example.com", urlBuilder.build().toString());
    }

}