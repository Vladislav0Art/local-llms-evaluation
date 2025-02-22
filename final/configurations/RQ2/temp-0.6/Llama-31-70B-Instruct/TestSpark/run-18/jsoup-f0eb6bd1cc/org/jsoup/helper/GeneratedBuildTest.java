package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedBuildTest {

    // Test for build() method

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotEquals(inputUrl, outputUrl);
    }

}