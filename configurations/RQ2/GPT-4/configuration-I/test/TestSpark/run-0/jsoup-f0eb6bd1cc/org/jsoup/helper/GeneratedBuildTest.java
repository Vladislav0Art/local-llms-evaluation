package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;

import org.mockito.Mockito;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals(url, result);
    }

}