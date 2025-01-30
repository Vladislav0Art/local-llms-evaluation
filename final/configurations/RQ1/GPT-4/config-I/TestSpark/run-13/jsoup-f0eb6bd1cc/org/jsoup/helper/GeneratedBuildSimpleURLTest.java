package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildSimpleURLTest {

    @Test
    public void buildSimpleURLTest() throws MalformedURLException {
        URL url = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals(result, url);
    }

}