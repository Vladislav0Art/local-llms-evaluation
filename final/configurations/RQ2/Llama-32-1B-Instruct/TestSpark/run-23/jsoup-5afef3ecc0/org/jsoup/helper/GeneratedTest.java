package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testUrlBuilder() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        assertEquals("https:", urlBuilder.build().getScheme());
        assertEquals("path", urlBuilder.build().getPath());
        assertEquals("/", urlBuilder.build().toString().split("/")[0]);
        assertTrue(urlBuilder.build().toString().contains("?"));
        assertTrue(urlBuilder.build().toString().contains("&"));
        assertEquals(2, urlBuilder.build().toString().length() - 1);
    }

    @Test
    public void testAppendKeyVal() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv = new KeyVal("a", "1");
        String result = urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?%20a=1", result);
    }

    @Test
    public void testAppendKeyValNull() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv = null;
        String result = urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?%20", result);
    }

    @Test
    public void testAppendKeyValEmptyString() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv = new KeyVal("", "");
        String result = urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?%20a="",", result);
    }

    @Test
    public void testAppendKeyValNullString() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv = new KeyVal("", null);
        String result = urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?%20a="",", result);
    }

    @Test
    public void testAppendKeyValNullStringArray() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv[] ks = new KeyVal[]{new KeyVal("a", 1), new KeyVal("", 0)};
        String result = urlBuilder.appendKeyVal(ks);
        assertEquals("https://example.com/path?%20a=1&b="",", result);
    }

    @Test
    public void testAppendKeyValNullStringArray2() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv[] ks = new KeyVal[]{new KeyVal("", 0), new KeyVal("", null)};
        String result = urlBuilder.appendKeyVal(ks);
        assertEquals("https://example.com/path?%20a="",b=2", result);
    }

    @Test
    public void testAppendKeyValNullStringArray3() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv[] ks = new KeyVal[]{new KeyVal("", 0), null, new KeyVal("", null)};
        String result = urlBuilder.appendKeyVal(ks);
        assertEquals("https://example.com/path?%20a=1&b="",", result);
    }

    @Test
    public void testAppendKeyValNullStringArray4() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv[] ks = new KeyVal[]{new KeyVal("", 0), null, null};
        String result = urlBuilder.appendKeyVal(ks);
        assertEquals("https://example.com/path?%20a=1&b="",", result);
    }

}