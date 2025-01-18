package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        Assert.assertNotNull(builder);
    }

}