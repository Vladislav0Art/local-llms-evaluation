package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com?search=test");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertEquals(urlBuilder.u, url);
    }

}