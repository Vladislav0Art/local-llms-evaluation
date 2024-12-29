package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildEmptyUrlTest {

    @Test
    public void buildEmptyUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://"));
        URL url = urlBuilder.build();
        Assert.assertEquals("http://", url.toString());
    }

}