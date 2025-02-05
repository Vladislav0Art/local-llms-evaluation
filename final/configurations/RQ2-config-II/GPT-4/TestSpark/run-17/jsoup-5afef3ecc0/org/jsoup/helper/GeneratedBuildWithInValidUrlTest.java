package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWithInValidUrlTest {

    @Test
    public void buildWithInValidUrlTest() throws MalformedURLException {
        URL testUrl = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Assert.assertEquals(testUrl, urlBuilder.build());
    }

}