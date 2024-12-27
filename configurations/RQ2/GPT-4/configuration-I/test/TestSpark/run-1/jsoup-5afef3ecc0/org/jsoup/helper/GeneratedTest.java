package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.someurl.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void buildValidURLTest() throws Exception {
        URL url = new URL("http://www.someurl.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL result = urlBuilder.build();

        Assert.assertEquals(url, result);
    }

    @Test
    public void buildNullURLTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);

        urlBuilder.build();
    }

}