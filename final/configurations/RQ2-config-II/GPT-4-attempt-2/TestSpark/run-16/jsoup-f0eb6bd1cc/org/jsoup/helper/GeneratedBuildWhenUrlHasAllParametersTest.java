package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWhenUrlHasAllParametersTest {

    @Test
    public void buildWhenUrlHasAllParametersTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com?page=2"));

        URL builtUrl = urlBuilder.build();

        Assert.assertNotNull(builtUrl);
        Assert.assertEquals("http://www.example.com?page=2", builtUrl.toString());
    }

}