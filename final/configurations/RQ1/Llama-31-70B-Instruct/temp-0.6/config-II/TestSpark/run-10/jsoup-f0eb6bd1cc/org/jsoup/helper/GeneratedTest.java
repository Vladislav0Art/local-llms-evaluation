package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void buildWithMalformedURL() {
        try {
            UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com"));
            builder.build();
            fail();
        } catch (MalformedURLException e) {
            assertEquals(e.getMessage(), "no protocol: http://www.example.com");
        }
    }

    @Test
    public void buildWithNullURL() {
        try {
            UrlBuilder builder = new UrlBuilder(null);
            builder.build();
            fail();
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "url must not be null");
        }
    }

    @Test
    public void buildWithNullQuery() {
        try {
            UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com"));
            builder.q = null;
            builder.build();
            fail();
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "query");
        }
    }

    @Test
    public void buildWithNullURI() {
        try {
            UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com"));
            builder.u = null;
            builder.build();
            fail();
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "uri");
        }

    }