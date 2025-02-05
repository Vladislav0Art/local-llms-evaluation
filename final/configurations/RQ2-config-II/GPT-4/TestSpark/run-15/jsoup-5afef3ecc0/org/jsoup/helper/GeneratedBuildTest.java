package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        URL result = builder.build();

        Assert.assertEquals(testUrl, result);
    }

}