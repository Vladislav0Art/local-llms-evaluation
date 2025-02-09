package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.hamcrest.core.IsEqual.equalTo;

public class GeneratedUrlBuilderConstructorWithValidUrlTest {

    @Test
    public void urlBuilderConstructorWithValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNotNull(urlBuilder);
    }

}