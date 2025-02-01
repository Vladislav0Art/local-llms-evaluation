package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildUrlWithNoQueryTest {

    @Test
    public void buildUrlWithNoQueryTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://google.com"));
        URL url = urlBuilder.build();
        Assert.assertEquals("https://google.com", url.toString());
    }

}