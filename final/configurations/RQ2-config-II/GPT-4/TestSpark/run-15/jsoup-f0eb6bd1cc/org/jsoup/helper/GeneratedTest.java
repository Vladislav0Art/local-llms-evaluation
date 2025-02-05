package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.jsoup.helper.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);

        assertNotNull(builder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);

        URL builtUrl = builder.build();

        assertEquals("http://www.example.com", builtUrl.toString());
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("ht:://www.invalidurl");
        UrlBuilder builder = new UrlBuilder(url);

        URL builtUrl = builder.build();
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");

        builder.appendKeyVal(keyVal);
    }

    @Test
    public void appendKeyValInvalidEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "\uD800");

        builder.appendKeyVal(keyVal);
    }

}