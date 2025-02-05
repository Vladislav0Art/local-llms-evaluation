package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorInvalidUrlTest {

    @Test
    public void urlBuilderConstructorInvalidUrlTest() {
        URL inputUrl = new URL("invalid-url");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

}