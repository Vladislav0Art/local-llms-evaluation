package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildWithRefTest {

    @Test
    public void buildWithRefTest() throws Exception {
        String urlString = "http://example.com#ref";
        String normalizedRef = "%20ref%20";
        URL url = new URL(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertTrue(urlBuilder.build().toString().endsWith(normalizedRef));
    }

}