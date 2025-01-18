package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderTest {

    @Test
    public void UrlBuilderTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        assertNotNull(urlBuilder);
    }

}