package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://google.com/search?q=jsoup"));
        URL url = urlBuilder.build();
        Assert.assertEquals("https://google.com/search?q=jsoup", url.toString());
    }

}