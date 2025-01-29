package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;

public class GeneratedTest {

    @Test
    public void testBuild() {
        UrlBuilder builder = new UrlBuilder("https://example.com");
        assertEquals("https://example.com", builder.build());
    }

    @Test
    public void testAppendKeyVal_Prefixes() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(builder.appendKeyVal(new java.net.KeyValue("prefix1", "value1")) == null);
        assertFalse(builder.appendKeyVal(new java.net.KeyValue("prefix2", "value2")) == null);
    }

    @Test
    public void testAppendKeyVal_Bold() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(builder.appendKeyVal(java.util.Map.of("boldkey1", "boldvalue1").toString()) == null);
        assertFalse(builder.appendKeyVal(java.util.Map.of("boldkey2", "boldvalue2").toString()) == null);
    }

    @Test
    public void testAppendKeyVal_Empty() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(builder.appendKeyVal(null) == null);
        assertFalse(builder.appendKeyVal(java.util.Map.of()).toString().equals(builder.toString()));
    }

    @Test
    public void testAppendKeyVal_Null() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new java.net.KeyValue(null, null)));
    }

    @Test
    public void testAppendKeyVal_Single() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(builder.appendKeyVal(java.util.Map.of().toString()) == null);
        assertFalse(builder.appendKeyVal(java.util.Map.of()).toString().equals(builder.toString()));
    }

    @Test
    public void testAppendKeyVal_NoValue() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(builder.appendKeyVal(new java.net.KeyValue(null, null)) == null);
        assertFalse(builder.appendKeyVal(java.util.Map.of()).toString().equals(builder.toString()));
    }

    @Test
    public void testAppendKeyVal_EmptyMap() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(builder.appendKeyVal(new java.net.KeyValue("", "")) == null);
        assertFalse(builder.appendKeyVal(java.util.Map.of()).toString().equals(builder.toString()));
    }

    @Test
    public void testAppendKeyVal_EmptyString() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new java.net.KeyValue("", "")));
    }

}