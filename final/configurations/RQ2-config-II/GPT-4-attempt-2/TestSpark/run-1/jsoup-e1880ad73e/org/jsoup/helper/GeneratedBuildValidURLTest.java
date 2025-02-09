package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildValidURLTest {

    @Test
    public void buildValidURLTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        URL outputUrl = urlBuilder.build();
        assertEquals("http://www.google.com", outputUrl.toString());
    }

}