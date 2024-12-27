package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import org.mockito.Mockito;

public class GeneratedUrlBuilderInvalidUrlTest {

    @Test
    public void urlBuilderInvalidUrlTest() throws MalformedURLException {
        new UrlBuilder(new URL("invalid_url"));
    }

}