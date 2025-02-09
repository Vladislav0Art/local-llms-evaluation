package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildInvalidURLTest {

    @Test
    public void buildInvalidURLTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http:/google.com"));
        urlBuilder.build();
    }

}