package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderAppendKeyValTest {

    @Test
    public void urlBuilderAppendKeyValTest() {
        URL url;
        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            fail("Failed to create test URL: " + e.getMessage());
            return;
        }
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal("key", "value");
        } catch (UnsupportedEncodingException e) {
            fail("Exception while appending key-value pair: " + e.getMessage());
        }
        assertNotNull(builder.q);
    }

}