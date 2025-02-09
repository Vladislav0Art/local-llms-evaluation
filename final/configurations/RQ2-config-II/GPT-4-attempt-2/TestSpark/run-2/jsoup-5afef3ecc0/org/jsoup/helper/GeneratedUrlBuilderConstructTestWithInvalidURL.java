package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructTestWithInvalidURL {

    @Test
    public void UrlBuilderConstructTestWithInvalidURL() throws MalformedURLException {
        URL inputUrl = new URL("htp://invalid-url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
    }

}