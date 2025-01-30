package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com?param=value");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        assertNotNull(obj);
    }

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL transformedUrl = obj.build();
        assertNotNull(transformedUrl);
    }

    @Test
    public void buildTest_WithQueryString() throws Exception {
        URL inputUrl = new URL("https://www.example.com?param=value");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL builtURL = obj.build();
        assertNotNull(builtURL);
        assertEquals("param=value", builtURL.getQuery());
    }

    @Test
    public void buildTest_WithInvalidQuery() throws Exception {
        URL inputUrl = new URL("https://www.example.com?param=\uD83D\uDE09");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL builtURL = obj.build();
        assertNotNull(builtURL);
        assertNotEquals("\uD83D\uDE09", builtURL.getQuery());
    }

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL transformedUrl = obj.build();
        assertNotNull(transformedUrl);
        assertEquals("www.example.com", transformedUrl.getHost());
    }

    @Test
    public void buildTest_WithNonASCIICharacter() throws Exception {
        URL inputUrl = new URL("http://例子.卷筒纸");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        obj.build();
    }

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL transformedUrl = obj.build();
        assertEquals(inputUrl, transformedUrl);
    }

}