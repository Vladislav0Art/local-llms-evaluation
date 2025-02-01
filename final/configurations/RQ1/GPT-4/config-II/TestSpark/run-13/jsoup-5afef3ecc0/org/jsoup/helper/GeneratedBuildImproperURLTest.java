package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedBuildImproperURLTest {

    @Test
    public void buildImproperURLTest() throws MalformedURLException {
        URL url = new URL("http:/abc.com?query=value");
        UrlBuilder builder = new UrlBuilder(url);

        URL resultURL = builder.build();

        Assert.assertEquals(url, resultURL);
    }

}