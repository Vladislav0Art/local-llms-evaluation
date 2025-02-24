package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBuildBaseUrlTest {

    @Test
    public void buildBaseUrlTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://www.example.com", actualUrl.toString());
    }

}