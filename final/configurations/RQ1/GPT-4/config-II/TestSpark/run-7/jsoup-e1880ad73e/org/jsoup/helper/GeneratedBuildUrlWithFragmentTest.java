package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildUrlWithFragmentTest {

    @Test
    public void buildUrlWithFragmentTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://google.com#fragment"));
        URL url = urlBuilder.build();
        Assert.assertEquals("https://google.com#fragment", url.toString());
    }

}