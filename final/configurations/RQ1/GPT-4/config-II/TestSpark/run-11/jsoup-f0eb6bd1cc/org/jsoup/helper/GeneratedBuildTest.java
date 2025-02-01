package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL newUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(newUrl);

        URL result = urlBuilder.build();

        assertEquals("http://www.example.com", result.toString());
    }

}