package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.someurl.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertNotNull(urlBuilder);
    }

}