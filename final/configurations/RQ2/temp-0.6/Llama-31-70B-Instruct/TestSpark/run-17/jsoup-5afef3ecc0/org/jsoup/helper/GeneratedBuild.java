package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedBuild {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL url = new URL("http://www.example.com/");
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void build() throws MalformedURLException {
        URL url = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();

        Assert.assertEquals("http://www.example.com/", result.toString());
    }

}