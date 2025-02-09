package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildURLTest {

    @Test
    public void buildURLTest() throws MalformedURLException {
        URL inputUrl = new URL("https://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        Assert.assertNotNull(outputUrl);
        Assert.assertEquals("https://google.com", outputUrl.toString());
    }

}