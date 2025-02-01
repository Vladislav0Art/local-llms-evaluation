package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildURLWithNonAsciiCharacterTest {

    @Test
    public void buildURLWithNonAsciiCharacterTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://google.com/search?q=jsoup✈️"));
        URL url = urlBuilder.build();
        Assert.assertEquals("https://google.com/search?q=jsoup%E2%9C%88%EF%B8%8F", url.toString());
    }

}