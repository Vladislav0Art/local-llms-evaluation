package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedBuild_InvalidUrlTest {

    @Test
    public void build_InvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("invalidUrl");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}