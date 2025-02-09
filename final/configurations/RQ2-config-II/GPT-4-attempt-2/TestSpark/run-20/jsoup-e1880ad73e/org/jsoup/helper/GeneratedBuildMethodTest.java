package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildMethodTest {

    @Test
    public void buildMethodTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);

        URL buildUrl = builder.build();

        Assert.assertEquals(url, buildUrl);
    }

}