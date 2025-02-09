package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructTest {

    @Test
    public void UrlBuilderConstructTest() throws MalformedURLException {
        URL inputUrl = new URL("https://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(urlBuilder);
    }

}