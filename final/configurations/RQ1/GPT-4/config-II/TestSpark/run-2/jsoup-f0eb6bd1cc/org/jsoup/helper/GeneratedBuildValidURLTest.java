package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildValidURLTest {

    @Test
    public void buildValidURLTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com/");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("https://www.google.com/", result.toString());
    }

}