package org.jsoup.helper;

import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL buildUrl = urlBuilder.build();
            assertEquals(url.toString(), buildUrl.toString());
        } catch (MalformedURLException e) {
            fail("Building UrlBuilder failed with a MalformedURLException");
        }
    }

}