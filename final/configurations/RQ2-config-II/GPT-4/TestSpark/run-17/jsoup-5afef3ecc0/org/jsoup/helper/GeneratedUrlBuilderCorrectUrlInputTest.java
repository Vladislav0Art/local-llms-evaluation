package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderCorrectUrlInputTest {

    @Test
    public void UrlBuilderCorrectUrlInputTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Assert.assertNotNull(urlBuilder);
    }

}