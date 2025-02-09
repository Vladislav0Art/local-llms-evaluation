package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderInvalidUrlTest {

    @Test
    public void UrlBuilderInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("invalid url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
    }

}