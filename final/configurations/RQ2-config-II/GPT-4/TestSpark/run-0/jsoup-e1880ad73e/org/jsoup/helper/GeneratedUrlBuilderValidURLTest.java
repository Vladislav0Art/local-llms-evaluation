package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderValidURLTest {

    @Test
    public void UrlBuilderValidURLTest() throws MalformedURLException {
        URL url = new URL("http://validurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(urlBuilder.build(), url);
    }

}