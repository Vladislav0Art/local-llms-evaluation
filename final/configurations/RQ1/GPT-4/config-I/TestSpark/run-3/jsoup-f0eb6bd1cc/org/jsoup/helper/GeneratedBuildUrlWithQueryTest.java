package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key", "value", "UTF-8"));
        URL resultUrl = urlBuilder.build();

        assertEquals("https://www.example.com?key=value", resultUrl.toString());
    }

}