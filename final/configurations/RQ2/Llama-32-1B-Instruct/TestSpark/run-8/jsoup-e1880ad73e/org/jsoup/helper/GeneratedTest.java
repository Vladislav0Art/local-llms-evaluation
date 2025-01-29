package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testBuild() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        assertEquals(new URL("https://www.example.com"), urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        urlBuilder.appendKeyVal(key, value);
        assertEquals("{\"key\":\"value\"}", urlBuilder.build().toURI().toString());
    }

    @Test
    public void testAppendKeyVal_InvalidType() {
        String key = "key";
        String value = "value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        try {
            urlBuilder.appendKeyVal(null, value);
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void testAppendKeyVal_EmptyKeyValue() throws UnsupportedEncodingException {
        String key = "";
        String value = "value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        urlBuilder.appendKeyVal(key, value);
        assertEquals("{\"key\":\"value\"}", urlBuilder.build().toURI().toString());
    }

    @Test
    public void testAppendKeyVal_InvalidValue() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value1";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        try {
            urlBuilder.appendKeyVal(key, value);
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void testAppendKeyVal_InvalidURL() throws UnsupportedEncodingException {
        String key = "key";
        URL url = new URL("invalid:https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(key, "value");
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void testAppendKeyVal_InvalidKeyValueType() throws UnsupportedEncodingException {
        String key = "key";
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(1, "value");
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

}