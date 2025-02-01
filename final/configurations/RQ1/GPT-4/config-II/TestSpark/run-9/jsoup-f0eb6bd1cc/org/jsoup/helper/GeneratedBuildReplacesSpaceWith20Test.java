package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedBuildReplacesSpaceWith20Test {

    @Test
    public void buildReplacesSpaceWith20Test() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/a b"));
        URL result = urlBuilder.build();

        Assert.assertTrue(result.toString().endsWith("a%20b"));
    }

}