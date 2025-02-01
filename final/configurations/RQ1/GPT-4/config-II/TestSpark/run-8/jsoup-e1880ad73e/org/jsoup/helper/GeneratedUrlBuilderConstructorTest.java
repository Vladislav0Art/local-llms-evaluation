package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(urlBuilder);
    }

}