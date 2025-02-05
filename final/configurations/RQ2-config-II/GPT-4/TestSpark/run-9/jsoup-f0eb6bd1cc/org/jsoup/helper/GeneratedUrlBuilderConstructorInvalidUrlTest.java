package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorInvalidUrlTest {

    @Test
    public void UrlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("invalid.url");
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

}