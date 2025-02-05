package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderTest_NullUrl {

    @Test
    public void UrlBuilderTest_NullUrl() {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
    }

}