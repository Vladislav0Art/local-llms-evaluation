package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Assert.assertNotNull(urlBuilder.build());
            Assert.assertTrue(urlBuilder.build() instanceof URL);
        } catch (MalformedURLException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL result = urlBuilder.build();
            Assert.assertNotNull(result);
            Assert.assertEquals(inputUrl, result);
        } catch (MalformedURLException e) {
            Assert.fail(e.getMessage());
        }
    }

}