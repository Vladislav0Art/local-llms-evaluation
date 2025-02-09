package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedUrlBuilder_ConstructorTest {

    @Test
    public void urlBuilder_ConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Assert.assertNotNull(urlBuilder);
    }

}