package org.jsoup.helper;

import org.jsoup.Connection;
import org.mockito.Mockito;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilderTest {

    @Test
    public void UrlBuilderTest() {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

}