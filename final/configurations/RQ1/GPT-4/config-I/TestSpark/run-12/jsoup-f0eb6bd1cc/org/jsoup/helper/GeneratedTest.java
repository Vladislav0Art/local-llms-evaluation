package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder ub = new UrlBuilder(url);
        assertNotNull(ub);
    }

    @Test
    public void buildBasicTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder ub = new UrlBuilder(url);
        URL result = ub.build();
        assertEquals(result.toString(), "https://www.example.com");
    }

    @Test
    public void buildEncodingTest() throws Exception {
        URL url = new URL("https://www.example.com/äöü");
        UrlBuilder ub = new UrlBuilder(url);
        URL result = ub.build();
        assertEquals(result.toString(), "https://www.example.com/%C3%A4%C3%B6%C3%BC");
    }

    @Test
    public void buildQueryTest() throws Exception {
        URL url = new URL("https://www.example.com?query=value");
        UrlBuilder ub = new UrlBuilder(url);
        URL result = ub.build();
        assertEquals(result.toString(), "https://www.example.com?query=value");
    }

    @Test
    public void decodePartExceptionTest() throws Exception {
        URL url = new URL("https://www.example.com/äöü");
        UrlBuilder ub = new UrlBuilder(url);
        ub.build();
    }

}