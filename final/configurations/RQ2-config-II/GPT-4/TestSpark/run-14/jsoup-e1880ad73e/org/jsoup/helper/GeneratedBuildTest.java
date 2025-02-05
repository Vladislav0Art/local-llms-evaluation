package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        String stringUrl = "http://test.url";
        try {
            URL url = new URL(stringUrl);
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL builtUrl = urlBuilder.build();
            Assert.assertNotNull(builtUrl);
        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

}