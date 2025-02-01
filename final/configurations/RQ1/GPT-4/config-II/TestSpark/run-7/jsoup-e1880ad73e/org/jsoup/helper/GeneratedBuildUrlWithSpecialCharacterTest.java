package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildUrlWithSpecialCharacterTest {

    @Test
    public void buildUrlWithSpecialCharacterTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://google.com/search?q=jsoup%20library"));
        URL url = urlBuilder.build();
        Assert.assertEquals("https://google.com/search?q=jsoup+library", url.toString());
    }

}