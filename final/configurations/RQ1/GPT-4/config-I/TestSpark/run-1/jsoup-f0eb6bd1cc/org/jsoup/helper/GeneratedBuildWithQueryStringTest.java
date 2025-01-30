package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildWithQueryStringTest {

    @Test
    public void BuildWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/search?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        Assert.assertEquals("http://www.google.com/search?q=test", result.toString());
    }

}