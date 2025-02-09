package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedUrlBuilderInvalidURLTest {

    @Test
    public void UrlBuilderInvalidURLTest() throws MalformedURLException {
        URL inputUrl = new URL("htt://www.example.com");
        new UrlBuilder(inputUrl);
    }

}