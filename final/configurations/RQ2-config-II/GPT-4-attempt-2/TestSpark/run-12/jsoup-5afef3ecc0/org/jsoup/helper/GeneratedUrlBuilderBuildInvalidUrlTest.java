package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderBuildInvalidUrlTest {

    @Test
    public void UrlBuilderBuildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("://www.invalid.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        Assert.assertNull(outputUrl);
    }

}