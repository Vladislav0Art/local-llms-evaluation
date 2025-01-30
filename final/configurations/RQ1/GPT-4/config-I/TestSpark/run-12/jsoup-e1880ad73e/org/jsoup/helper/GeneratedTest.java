package org.jsoup.helper;

import org.jsoup.helper.Validate;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
        assertEquals("www.google.com", urlBuilder.u.getHost());
        assertEquals("http", urlBuilder.u.getProtocol());
        assertEquals("/?query=test", urlBuilder.u.getFile());
        assertEquals("query=test", urlBuilder.q.toString());
    }

    @Test
    public void UrlBuilderBuildTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://www.example.com", urlBuilder.build().toString());
    }

    @Test
    public void decodePartExceptionTest() throws Exception {
        UrlBuilder.class.getDeclaredMethod("decodePart", String.class)
                .invoke(null, "invalid url part \"%\"");
    }

    @Test
    public void decodePartExceptionTest() throws Exception {
        UrlBuilder.class.getDeclaredMethod("decodePart", String.class)
                .invoke(new UrlBuilder(new URL("http://www.google.com")), "invalid url part \"%\"");
    }

}