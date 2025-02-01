package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

}