package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithInValidURLTest {

    @Test
    public void buildWithInValidURLTest() {
        URL inputUrl = new URL("htttp://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}