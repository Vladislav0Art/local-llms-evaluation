package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildWithQueryAndRefTest {

    @Test
    public void buildWithQueryAndRefTest() throws Exception {
        URL inputUrl = new URL("http://test.com?search=test#page1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, resultUrl);
    }

}