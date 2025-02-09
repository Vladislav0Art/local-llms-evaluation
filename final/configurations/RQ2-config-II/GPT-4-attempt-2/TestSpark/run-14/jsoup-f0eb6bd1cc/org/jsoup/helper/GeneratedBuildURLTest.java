package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;

public class GeneratedBuildURLTest {

    @Test
    public void buildURLTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL outputUrl = urlBuilder.build();
            assertEquals(url, outputUrl);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException");
        }
    }

}