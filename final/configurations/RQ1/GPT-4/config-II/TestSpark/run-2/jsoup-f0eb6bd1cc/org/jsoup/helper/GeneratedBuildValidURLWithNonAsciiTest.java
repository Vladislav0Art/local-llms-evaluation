package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildValidURLWithNonAsciiTest {

    @Test
    public void buildValidURLWithNonAsciiTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com/ç/ü/é");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("https://www.google.com/%C3%A7/%C3%BC/%C3%A9", result.toString());
    }

}