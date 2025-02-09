package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() {
        URL testUrl = null;
        try {
            testUrl = new URL("http://test.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Assert.assertNotNull(urlBuilder);
    }

}