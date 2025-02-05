package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderValidInputTest {

    @Test
    public void UrlBuilderValidInputTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            Assert.assertNotNull(builder);
        } catch (MalformedURLException e) {
            Assert.fail();
        }
    }

}