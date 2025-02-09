package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL validURL = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(validURL);
        Assert.assertNotNull(urlBuilder.build());
    }

}