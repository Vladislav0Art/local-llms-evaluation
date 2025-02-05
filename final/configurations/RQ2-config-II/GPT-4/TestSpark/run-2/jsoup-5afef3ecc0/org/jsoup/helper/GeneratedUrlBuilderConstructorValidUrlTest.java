package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderConstructorValidUrlTest {

    @Test
    public void urlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Assert.assertNotNull(builder);
    }

}