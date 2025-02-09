package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderNonNullUrlTest {

    @Test
    public void UrlBuilderNonNullUrlTest() {
        URL testUrl = null;
        try {
            testUrl = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            // handle exception
        }

        UrlBuilder testBuilder = new UrlBuilder(testUrl);
        Assert.assertNotNull(testBuilder);
    }

}