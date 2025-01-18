package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection.KeyVal;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorTest {

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

}