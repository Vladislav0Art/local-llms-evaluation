package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithValidURLTest {

    @Test
    public void buildWithValidURLTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://www.example.com");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}