package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildWithNotNullRefTest {

    @Test
    public void buildWithNotNullRefTest() throws Exception {
        URL url = new URL("http://sampledomain.com#sampleRef");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals(url, actualUrl);
    }

}