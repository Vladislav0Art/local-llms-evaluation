package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBuildUrlWithQueryStringTest {

    @Test
    public void buildUrlWithQueryStringTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://www.example.com?q=test", actualUrl.toString());
    }

}