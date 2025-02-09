package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderNullTest {

    @Test
    public void UrlBuilderNullTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (MalformedURLException ex) {
            fail("Malformed URL");
        }
    }

}