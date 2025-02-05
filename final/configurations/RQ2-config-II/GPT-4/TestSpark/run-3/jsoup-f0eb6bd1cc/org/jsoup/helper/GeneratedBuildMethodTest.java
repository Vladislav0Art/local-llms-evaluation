package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildMethodTest {

    @Test
    public void buildMethodTest() throws MalformedURLException {
        String url = "https://www.google.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        URL builtUrl = urlBuilder.build();
        assertEquals(url, builtUrl.toString());
    }

}