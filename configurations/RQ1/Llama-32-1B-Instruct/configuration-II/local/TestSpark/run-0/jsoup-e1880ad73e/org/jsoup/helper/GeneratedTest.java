package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal_NoSpaces() {
        URLBuilder builder = new UrlBuilder("https://example.com/path?param1=value1&param2=value2");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build());
        assertEquals("https%3A%2F%2Fexample.com%2Fpath%3F%26param1%3Dvalue1%26param2%3Dvalue2", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_Spaces() {
        URLBuilder builder = new UrlBuilder("https://example.com/path?param1=value1&param2=value2");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), true);
        assertEquals("https%3A%2F%2Fexample.com%2Fpath%3F%26param1%3Dvalue1%26param2%3Dvalue2%20space%3Dplus", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_EmptyString() {
        URLBuilder builder = new UrlBuilder("https://example.com/path?param1=value1&param2=value2");
        builder.appendKeyVal(null, false);
        assertEquals("https%3A%2F%2Fexample.com%2Fpath%3F%26param1%3Dvalue1%26param2%3Dvalue2", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path#anchor?param1=value1&param2=value2");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example.com/path#anchor%26param1%3Dvalue1%26param2%3Dvalue2", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_SpacesInFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path#anchor?param1=value1&param2=value2");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), true);
        assertEquals("https%3A//example.com/path#anchor%20space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiPath() {
        URLBuilder builder = new UrlBuilder("https://example.com/path\\u00e9?param1=value1&param2=value2");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example.com/path%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiPathInFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path\\u00e9#anchor?param1=value1&param2=value2");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example.com/path%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2%20anchor%3Dspace%3Dplus", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiHost() {
        URLBuilder builder = new UrlBuilder("https://example\\u00e9/path?param1=value1&param2=value2");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiQuery() {
        URLBuilder builder = new UrlBuilder("https://example\\u00e9/path?param1=value1&param2=value2?key=value3");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2?space%3Dplus%26key%3Dvalue3", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiQueryInFragment() {
        URLBuilder builder = new UrlBuilder("https://example\\u00e9/path?param1=value1&param2=value2#anchor?key=value3");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2%20anchor%3Dspace%3Dplus?space%3Dplus%26key%3Dvalue3", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiQueryInFragmentAndPath() {
        URLBuilder builder = new UrlBuilder("https://example\\u00e9/path#anchor?param1=value1&param2=value2?key=value3");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2?space%3Dplus%26anchor%3Dspace%3Dplus%26key%3Dvalue3", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiQueryInFragmentAndPathAndHost() {
        URLBuilder builder = new UrlBuilder("https://example\\u00e9/path#anchor?param1=value1&param2=value2?key=value3");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2%20anchor%3Dspace%3Dplus?space%3Dplus%26key%3Dvalue3", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_UrlWithNonAsciiQueryInFragmentAndPathAndHostAndKey() {
        URLBuilder builder = new UrlBuilder("https://example\\u00e9/path#anchor?param1=value1&param2=value2?key=value3");
        builder.appendKeyVal(new Connection.KeyVal.Builder().put("key", "value").build(), false);
        assertEquals("https%3A//example%21space%3Dplus%26param1%3Dvalue1%26param2%3Dvalue2%20anchor%3Dspace%3Dplus?space%3Dplus%26key%3Dvalue3", builder.build().toString());
    }
}

}