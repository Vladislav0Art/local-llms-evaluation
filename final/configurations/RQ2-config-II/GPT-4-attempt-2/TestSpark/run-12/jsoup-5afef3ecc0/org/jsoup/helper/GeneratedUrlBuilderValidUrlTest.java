package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderValidUrlTest {

    @Test
    public void UrlBuilderValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

}