package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedBuildHandlesFragmentsTest {

    @Test
    public void buildHandlesFragmentsTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com#a"));

        URL result = urlBuilder.build();

        Assert.assertTrue(result.toString().endsWith("#a"));
    }

}