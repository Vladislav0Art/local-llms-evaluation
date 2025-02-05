package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL outputUrl = urlBuilder.build();
            Assert.assertEquals(inputUrl, outputUrl);
        } catch (MalformedURLException e) {
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
    }

}