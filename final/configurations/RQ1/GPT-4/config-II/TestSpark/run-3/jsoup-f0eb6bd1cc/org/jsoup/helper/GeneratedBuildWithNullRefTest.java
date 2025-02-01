package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildWithNullRefTest {

    @Test
    public void buildWithNullRefTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals(url, actualUrl);
    }

}