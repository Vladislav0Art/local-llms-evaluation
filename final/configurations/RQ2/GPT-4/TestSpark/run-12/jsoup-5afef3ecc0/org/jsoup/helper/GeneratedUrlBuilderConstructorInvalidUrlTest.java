package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorInvalidUrlTest {

    @Test
    public void UrlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        URL invalidUrl = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(invalidUrl);
    }

}