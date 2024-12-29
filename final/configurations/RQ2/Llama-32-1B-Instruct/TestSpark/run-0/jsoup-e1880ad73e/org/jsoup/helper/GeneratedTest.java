package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal_Simple() {
        String inputUrl = "https://example.com";
        URLBuilder builder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://example.com?key1=value1&key2=value2";
        when(builder.build()).thenReturn(new Uri(expectedUrl));
        assertEquals(expectedUrl, builder.build());
    }

    @Test
    public void testAppendKeyVal_Wildcard() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        URLBuilder builder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://example.com/path?key1=value1[key2]=value2&key3=value3";
        when(builder.build()).thenReturn(new Uri(expectedUrl));
        assertEquals(expectedUrl, builder.build());
    }

    @Test
    public void testAppendKeyVal_Duplicates() {
        String inputUrl = "https://example.com/path?a=b&c=d&a=e";
        URLBuilder builder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://example.com/path?key1=value1[key2]=value2&key3=value3&a=e";
        when(builder.build()).thenReturn(new Uri(expectedUrl));
        assertEquals(expectedUrl, builder.build());
    }

    @Test
    public void testAppendKeyVal_NullConnection() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(null); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("null", e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_ThrowsUnsupportedEncodingException() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        try {
            URLBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(new UnsupportedEncodingException()); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("UnsupportedEncodingException", e.getMessage());
        }
    }

    @Test
    public void testBuild_Simple() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        URLBuilder builder = new UrlBuilder(inputUrl);
        assertTrue(builder.build().equals(new URI("https://example.com/path?a=b&c=d")));
    }

    @Test
    public void testBuild_Wildcard() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        URLBuilder builder = new UrlBuilder(inputUrl);
        assertTrue(builder.build().equals(new URI("https://example.com/path?key1=value1[key2]=value2")));
    }

    @Test
    public void testBuild_Duplicates() {
        String inputUrl = "https://example.com/path?a=b&c=d&a=e";
        URLBuilder builder = new UrlBuilder(inputUrl);
        assertTrue(builder.build().equals(new URI("https://example.com/path?key1=value1[key2]=value2&key3=value3")));
    }

    @Test
    public void testAppendKeyVal_NullKeyVal() {
        String inputUrl = "https://example.com/path?a=b";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(null); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("null", e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_ThrowsUnsupportedEncodingException() {
        String inputUrl = "https://example.com/path?a=b";
        try {
            URLBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(new UnsupportedEncodingException()); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("UnsupportedEncodingException", e.getMessage());
        }
    }

    @Test
    public void testBuild_NullConnection() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.build(); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("null", e.getMessage());
        }
    }

    @Test
    public void testBuild_ThrowsUnsupportedEncodingException() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        try {
            URLBuilder builder = new UrlBuilder(inputUrl);
            builder.build(); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("UnsupportedEncodingException", e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_MalformedKV() {
        String inputUrl = "https://example.com/path?a=b";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(new MalformedURLException()); // throws MalformedURLException
        } catch (MalformedURLException e) {
            assertEquals("MalformedURLException", e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_MalformedKey() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(new MalformedURLException()); // throws MalformedURLException
        } catch (MalformedURLException e) {
            assertEquals("MalformedURLException", e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_MalformedValue() {
        String inputUrl = "https://example.com/path?a=b";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(new MalformedURLException()); // throws MalformedURLException
        } catch (MalformedURLException e) {
            assertEquals("MalformedURLException", e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_EmptyKV() {
        String inputUrl = "https://example.com/path";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(new StringBuilder()); // throws NullPointerException
        } catch (NullPointerException e) {
            assertEquals("NullPointerException", e.getMessage());
        }
    }

    @Test
    public void testAppendKeyVal_ThrowsNullPointerException() {
        String inputUrl = "https://example.com/path";
        try {
            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(new StringBuilder()); // throws NullPointerException
        } catch (NullPointerException e) {
            assertEquals("NullPointerException", e.getMessage());
        }
    }

}