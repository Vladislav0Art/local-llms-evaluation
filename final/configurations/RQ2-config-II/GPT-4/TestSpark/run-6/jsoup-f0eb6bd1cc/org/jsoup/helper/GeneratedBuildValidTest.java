package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildValidTest {

    @Test
    public void buildValidTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            URL outputUrl = builder.build();
            Assert.assertEquals(inputUrl, outputUrl);
        } catch (MalformedURLException e) {
            Assert.fail();
        }
    }

}