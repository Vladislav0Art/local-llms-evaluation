package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderMalformedURLTest {

    @Test
    public void UrlBuilderMalformedURLTest() throws MalformedURLException {
        new UrlBuilder(new URL("htp://malformed.com"));
    }

}