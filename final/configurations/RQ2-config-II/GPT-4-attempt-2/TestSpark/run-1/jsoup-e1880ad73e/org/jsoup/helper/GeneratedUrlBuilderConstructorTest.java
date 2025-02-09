package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        assertNotNull(urlBuilder);
    }

}