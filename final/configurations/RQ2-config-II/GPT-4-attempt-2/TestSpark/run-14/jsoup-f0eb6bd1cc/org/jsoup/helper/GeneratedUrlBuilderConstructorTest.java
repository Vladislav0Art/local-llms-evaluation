package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() {
        URL url;
        try {
            url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException");
        }
    }

}