package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildUrlWithRefTest {

    @Test
    public void buildUrlWithRefTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("https://www.example.com#ref", resultUrl.toString());
    }

}