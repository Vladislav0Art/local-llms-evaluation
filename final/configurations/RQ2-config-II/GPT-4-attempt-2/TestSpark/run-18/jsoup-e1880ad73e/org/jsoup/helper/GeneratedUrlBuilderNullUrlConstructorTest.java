package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderNullUrlConstructorTest {

    @Test
    public void UrlBuilderNullUrlConstructorTest() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

}