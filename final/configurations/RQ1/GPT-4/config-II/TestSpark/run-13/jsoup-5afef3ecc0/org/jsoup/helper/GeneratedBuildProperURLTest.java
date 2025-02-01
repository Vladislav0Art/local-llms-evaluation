package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedBuildProperURLTest {

    @Test
    public void buildProperURLTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://abc.com?query=value");
        UrlBuilder builder = new UrlBuilder(url);

        URL resultURL = builder.build();

        Assert.assertEquals(new URL("http://abc.com/?query=value"), resultURL);
    }

}