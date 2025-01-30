package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildNoQueryStringTest {

    @Test
    public void BuildNoQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        Assert.assertEquals("http://www.google.com/", result.toString());
    }

}