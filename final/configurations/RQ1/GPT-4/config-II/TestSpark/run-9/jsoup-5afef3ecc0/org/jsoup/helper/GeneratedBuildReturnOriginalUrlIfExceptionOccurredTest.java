package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildReturnOriginalUrlIfExceptionOccurredTest {

    @Test
    public void buildReturnOriginalUrlIfExceptionOccurredTest() throws Exception {
        String urlString = "http:::malformed";
        URL url = new URL(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertSame(url, urlBuilder.build());
    }

}