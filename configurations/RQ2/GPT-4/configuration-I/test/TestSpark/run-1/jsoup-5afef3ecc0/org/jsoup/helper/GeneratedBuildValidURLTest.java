package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildValidURLTest {

    @Test
    public void buildValidURLTest() throws Exception {
        URL url = new URL("http://www.someurl.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL result = urlBuilder.build();

        Assert.assertEquals(url, result);
    }

}