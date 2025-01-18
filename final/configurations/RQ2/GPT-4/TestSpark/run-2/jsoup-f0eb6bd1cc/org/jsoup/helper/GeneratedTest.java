package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            assertNotNull(builder);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void UrlBuilderConstructorExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("invalid");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            URL outputUrl = builder.build();
            assertEquals(outputUrl, inputUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildUrlConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder);
    }

    @Test
    public void buildUrlConstructorExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("invalid");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        assertEquals(outputUrl, inputUrl);
    }

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder);
    }

    @Test
    public void UrlBuilderConstructorExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("htp:/www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        assertEquals(outputUrl, inputUrl);
    }

}