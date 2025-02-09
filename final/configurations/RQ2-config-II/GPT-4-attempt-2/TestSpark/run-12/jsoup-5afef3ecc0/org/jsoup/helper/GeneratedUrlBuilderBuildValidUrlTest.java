package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderBuildValidUrlTest {

    @Test
    public void UrlBuilderBuildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        Assert.assertNotNull(outputUrl);
        Assert.assertEquals(inputUrl, outputUrl);
    }

}