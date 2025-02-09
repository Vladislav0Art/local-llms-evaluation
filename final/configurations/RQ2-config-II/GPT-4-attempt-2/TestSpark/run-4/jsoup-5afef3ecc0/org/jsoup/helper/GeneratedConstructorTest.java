package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("http://www.example.com", urlBuilder.build().toString());
    }

}