package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildMalformedUrlTest {

    @Test
    public void buildMalformedUrlTest() throws MalformedURLException {
        URL testUrl = new URL("http//www.example.\u0000com"); // Adding null byte to mock malformed URL
        UrlBuilder builder = new UrlBuilder(testUrl);
        assertEquals("http//www.example.\u0000com", builder.build().toString());
    }

}