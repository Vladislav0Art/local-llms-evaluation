package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com#ref space");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("ref%20space", urlBuilder.normalizeRef(url.getRef()));
    }

}