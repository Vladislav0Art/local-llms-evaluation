package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilder_WithValidUrlTest {

    @Test
    public void UrlBuilder_WithValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(urlBuilder.build(), inputUrl);
    }

}