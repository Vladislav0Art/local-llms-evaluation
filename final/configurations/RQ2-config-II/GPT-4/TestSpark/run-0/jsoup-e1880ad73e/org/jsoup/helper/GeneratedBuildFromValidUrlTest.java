package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildFromValidUrlTest {

    @Test
    public void buildFromValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://validurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals(url, builtUrl);
    }

}