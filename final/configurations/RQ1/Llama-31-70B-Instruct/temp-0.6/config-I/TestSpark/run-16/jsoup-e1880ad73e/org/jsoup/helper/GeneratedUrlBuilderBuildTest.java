package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderBuildTest {

    @Test
    public void urlBuilderBuildTest() {
        URL url;
        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            fail("Failed to create test URL: " + e.getMessage());
            return;
        }
        UrlBuilder builder = new UrlBuilder(url);
        try {
            URL normalized = builder.build();
        } catch (URISyntaxException | UnsupportedEncodingException e) {
            fail("Exception while building URL: " + e.getMessage());
        }
    }

}