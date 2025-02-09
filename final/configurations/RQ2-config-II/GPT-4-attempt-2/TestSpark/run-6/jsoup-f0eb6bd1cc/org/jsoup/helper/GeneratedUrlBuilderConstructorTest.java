package org.jsoup.helper;

import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            fail("Construction of UrlBuilder failed with a MalformedURLException");
        }
    }

}