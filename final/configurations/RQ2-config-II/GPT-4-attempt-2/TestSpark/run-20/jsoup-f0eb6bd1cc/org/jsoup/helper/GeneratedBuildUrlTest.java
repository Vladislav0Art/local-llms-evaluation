package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL builtUrl = urlBuilder.build();

        assertEquals(url, builtUrl);
    }

}