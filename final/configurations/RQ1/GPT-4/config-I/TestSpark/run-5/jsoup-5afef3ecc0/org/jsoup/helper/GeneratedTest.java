package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import java.net.URL;
import java.net.URI;

import org.jsoup.Connection;

public class GeneratedTest {

    @Test
    public void buildDefaultUrlTest() {
        try {
            URL url = new URL("http://www.test.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertEquals("Unexpected URL formed", "http://www.test.com", builder.build().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildInvaildUrlTest() throws Exception {
        URL url = new URL("this.is.wrong");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void buildWithQueryTest() {
        try {
            URL url = new URL("http://www.test.com?k1=v1");
            UrlBuilder builder = new UrlBuilder(url);
            assertEquals("URL with query parameters is not as expected", "http://www.test.com?k1=v1", builder.build().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildDefaultUrlTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://www.example.com", builder.build().toString());
    }

    @Test
    public void buildInvalidUrlTest() throws Exception {
        URL url = new URL("wrong.example");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void buildWithQueryTest() throws Exception {
        URL url = new URL("http://www.example.com?key=value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://www.example.com?key=value", builder.build().toString());
    }

    @Test
    public void buildDefaultUrlTest() {
        try {
            URL url = new URL("http://www.test.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertTrue("URL after build is not as expected", builder.build() != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildWithQueryTest() {
        try {
            URL url = new URL("http://www.test.com?k1=v1");
            UrlBuilder builder = new UrlBuilder(url);
            assertTrue("URL after build with query parameters is not as expected", builder.build() != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}