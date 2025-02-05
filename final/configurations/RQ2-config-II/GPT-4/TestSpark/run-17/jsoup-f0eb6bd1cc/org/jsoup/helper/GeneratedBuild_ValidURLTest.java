package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuild_ValidURLTest {

    @Test
    public void build_ValidURLTest() {
        URL url = null;
        try {
            url = new URL("https://example.com");
        } catch (MalformedURLException mue) {
            Assert.fail(mue.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultURL = urlBuilder.build();
        Assert.assertEquals(url, resultURL);
    }

}