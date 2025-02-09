package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void UrlBuilder_ConstructorWithURLTest() {
        try {
            URL url = new URL("https://www.example.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void build_ValidURLTest() {
        try {
            URL url = new URL("https://www.example.com");
            UrlBuilder builder = new UrlBuilder(url);
            URL builtUrl = builder.build();
            assertEquals(builtUrl, url);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void appendKeyVal_UnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("https://www.example.com");
            Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
            when(keyValMock.key()).thenReturn("?param");
            when(keyValMock.value()).thenReturn("value");

            UrlBuilder builder = new UrlBuilder(url);
            builder.appendKeyVal(keyValMock); // this should cause UnsupportedEncodingException
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void appendKeyVal_ValidUrlTest() {
        URL url = null;
        try {
            url = new URL("https://www.example.com");
            Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
            when(keyValMock.key()).thenReturn("param");
            when(keyValMock.value()).thenReturn("value");

            UrlBuilder builder = new UrlBuilder(url);
            builder.appendKeyVal(keyValMock);

            URL expectedUrl = new URL("https://www.example.com?param=value");
            URL actualUrl = builder.build();

            assertEquals(expectedUrl, actualUrl);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

}