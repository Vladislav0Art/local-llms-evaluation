package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorNullUrlTest {

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

}