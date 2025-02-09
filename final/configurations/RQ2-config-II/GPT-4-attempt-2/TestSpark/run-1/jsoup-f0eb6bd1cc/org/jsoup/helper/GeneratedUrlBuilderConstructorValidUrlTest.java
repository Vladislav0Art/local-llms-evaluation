package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorValidUrlTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Assert.assertNotNull(urlBuilder);
    }

}