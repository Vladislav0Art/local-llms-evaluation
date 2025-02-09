package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderCreationTest {

    @Test
    public void UrlBuilderCreationTest() {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(urlBuilder);
    }

}