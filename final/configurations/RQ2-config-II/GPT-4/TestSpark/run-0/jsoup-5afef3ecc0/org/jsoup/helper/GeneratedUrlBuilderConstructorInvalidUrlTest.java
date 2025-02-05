package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderConstructorInvalidUrlTest {

    // UrlBuilder instance creation test

    @Test
    public void urlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        new UrlBuilder(new URL("htt:/google"));
    }

}