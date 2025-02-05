package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            url = urlBuilder.build();
            Assert.assertEquals("http://test.com", url.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}