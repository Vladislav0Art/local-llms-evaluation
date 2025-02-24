package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildMalformedUrlTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildMalformedUrlTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/%E2%82");
        urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}