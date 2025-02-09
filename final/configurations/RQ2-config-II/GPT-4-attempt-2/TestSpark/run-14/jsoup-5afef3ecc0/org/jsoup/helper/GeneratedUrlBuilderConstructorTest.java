package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        assertNotNull(urlBuilder);
    }

}