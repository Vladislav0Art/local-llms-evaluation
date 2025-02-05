package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() {
        String stringUrl = "http://test.url";
        try {
            URL url = new URL(stringUrl);
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

}