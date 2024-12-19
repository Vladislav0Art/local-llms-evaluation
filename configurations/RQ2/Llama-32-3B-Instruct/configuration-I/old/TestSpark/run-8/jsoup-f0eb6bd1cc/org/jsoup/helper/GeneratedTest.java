package org.jsoup.helper;

import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder.UnsupportedEncodingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newUrlBuilder() {
        assertEquals(null, new UrlBuilder());
    }

    @Test
    public void UrlBuilderWithEmptyUrl() {
        URL url = new URL("");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("", builder.build().toString(), false);
    }

    @Test
    public void UrlBuilder_withInitialUrl() {
        URL url = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(""));
        List<KeyVal> keyVals = new ArrayList<>();
        keyVals.add(new KeyVal("key", "val"));
        builder.appendKeyVal(keyVals);
        assertEquals("key=val", builder.build().toString(), false);
    }

    @Test
    public void appendMultipleKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(""));
        List<KeyVal> keyVals = new ArrayList<>();
        keyVals.add(new KeyVal("key1", "val1"));
        keyVals.add(new KeyVal("key2", "val2"));
        builder.appendKeyVal(keyVals);
        assertEquals("key1=val1&key2=val2", builder.build().toString(), false);
    }

    @Test
    public void appendSameKeyValTwice() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(""));
        List<KeyVal> keyVals = new ArrayList<>();
        keyVals.add(new KeyVal("key", "val"));
        keyVals.add(new KeyVal("key", "val2"));
        builder.appendKeyVal(keyVals);
        assertEquals("key=val&key=val2", builder.build().toString(), false);
    }

    @Test
    public void appendEmptyKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(""));
        List<KeyVal> keyVals = new ArrayList<>();
        keyVals.add(new KeyVal("", ""));
        assertEquals("key=val&key2=", builder.build().toString(), false);
    }

    @Test
    public void appendNullKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(""));
        List<KeyVal> keyVals = new ArrayList<>();
        keyVals.add(null);
        assertNull(builder.build());
    }

    @Test
    public void buildWithQueryParams() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://example.com?param1=value1&param2=value2");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com?param1=value1", builder.build().toString(), false);
    }

}