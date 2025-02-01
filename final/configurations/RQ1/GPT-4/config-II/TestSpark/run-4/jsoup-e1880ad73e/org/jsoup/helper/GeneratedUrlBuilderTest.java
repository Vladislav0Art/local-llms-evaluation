package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.jsoup.Connection.KeyVal.create;
import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderTest {

    @Test
    public void UrlBuilderTest() throws Exception {
        URL url = new URL("https://www.example.com/?key1=val1&key2=val2");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

}