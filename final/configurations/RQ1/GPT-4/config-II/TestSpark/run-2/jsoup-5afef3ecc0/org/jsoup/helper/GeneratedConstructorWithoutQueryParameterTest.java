package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedConstructorWithoutQueryParameterTest {

    @Test
    public void constructorWithoutQueryParameterTest() throws MalformedURLException {
        URL testUrl = new URL("http://www.example.com/");
        UrlBuilder builder = new UrlBuilder(testUrl);
        assertEquals("http://www.example.com/", builder.build().toString());
    }

}