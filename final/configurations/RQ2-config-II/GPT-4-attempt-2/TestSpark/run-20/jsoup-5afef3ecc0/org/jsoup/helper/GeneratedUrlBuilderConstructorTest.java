package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);

        Assert.assertNotNull(urlBuilder);
    }

}