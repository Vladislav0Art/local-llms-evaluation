package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.*;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorWithNullOrEmptyUrlTest() {
        try {
            URL url = new URL("http://test.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (MalformedURLException e) {
            fail();
        }
    }

    @Test
    public void UrlBuilderConstructorWithValidUrlTest() {
        try {
            URL url = new URL("http://test.com/subpage");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (MalformedURLException e) {
            fail();
        }
    }

    @Test
    public void buildWhenUrlBuilderIsInitializedTest() {
        try {
            URL url = new URL("http://test.com/subpage");
            UrlBuilder builder = new UrlBuilder(url);
            URL builtUrl = builder.build();
            assertEquals(url, builtUrl);
        } catch (MalformedURLException e) {
            fail();
        }
    }

}