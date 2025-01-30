package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildInvalidURLTest {

    @Test
    public void buildInvalidURLTest() throws MalformedURLException {
        URL url = new URL("http:/example.com"); // Invalid URL
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}