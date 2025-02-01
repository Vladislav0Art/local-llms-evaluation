package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedUrlBuilderURLIsEmptyTest {

    @Test
    public void UrlBuilderURLIsEmptyTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNull(urlBuilder.q);
    }

}