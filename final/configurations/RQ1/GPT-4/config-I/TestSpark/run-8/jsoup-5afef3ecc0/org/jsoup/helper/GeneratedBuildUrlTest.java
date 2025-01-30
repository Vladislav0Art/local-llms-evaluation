package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com/path?param=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL actualUrl = urlBuilder.build();
        URL expectedUrl = new URL("https://www.example.com/path?param=value#anchor");
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}