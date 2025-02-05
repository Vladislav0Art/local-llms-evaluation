package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() {
        try {
            URL initialUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(initialUrl);
            URL url = urlBuilder.build();
            Assert.assertEquals(initialUrl, url);
        } catch (MalformedURLException e) {
            Assert.fail();
        }
    }

}