package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedBuildBasicUrlTest {

    @Test
    public void buildBasicUrlTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(testUrl, outputUrl);
    }

}