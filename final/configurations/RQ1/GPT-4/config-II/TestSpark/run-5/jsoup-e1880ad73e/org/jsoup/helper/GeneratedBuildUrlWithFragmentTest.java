package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildUrlWithFragmentTest {

    @Test
    public void buildUrlWithFragmentTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(url, urlBuilder.build());
    }

}