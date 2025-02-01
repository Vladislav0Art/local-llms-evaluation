package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL newUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(newUrl);

        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL newUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(newUrl);

        URL result = urlBuilder.build();

        assertEquals("http://www.example.com", result.toString());
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL newUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(newUrl);

        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();

        assertEquals("http://www.example.com?key=value", result.toString());
    }

    @Test
    public void decodePartTest() throws UnsupportedEncodingException {
        String result = UrlBuilder.decodePart("%GG");

        assertEquals("", result);
    }

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        UrlBuilder.appendToAscii("test str", true, new StringBuilder());
    }

}