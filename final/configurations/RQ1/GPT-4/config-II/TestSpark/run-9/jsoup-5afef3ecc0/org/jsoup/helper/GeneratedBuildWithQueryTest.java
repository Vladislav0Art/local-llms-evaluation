package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() throws Exception {
        String urlString = "http://example.com?query";
        String normalizedQuery = "+query+";
        URL url = new URL(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertTrue(urlBuilder.build().toString().contains(normalizedQuery));
    }

}