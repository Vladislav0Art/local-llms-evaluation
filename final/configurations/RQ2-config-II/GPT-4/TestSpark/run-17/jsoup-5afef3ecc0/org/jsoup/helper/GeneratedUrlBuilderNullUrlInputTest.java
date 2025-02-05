package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderNullUrlInputTest {

    @Test
    public void UrlBuilderNullUrlInputTest() {
        URL testUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
    }

}