package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderNullInputTest {

    @Test
    public void UrlBuilderNullInputTest() {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

}