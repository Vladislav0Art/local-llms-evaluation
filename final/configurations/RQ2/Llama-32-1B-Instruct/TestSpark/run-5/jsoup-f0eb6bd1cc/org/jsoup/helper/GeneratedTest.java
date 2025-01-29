package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringBuilder;

public class GeneratedTest {

    public String build() {
        return new URL("https://www.example.com").toString();
    }

    @Test
    public void testBuild_WithNullInput_ThrowsURISyntaxException() {
        try {
            new UrlBuilder(null).build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        java.util.HashMap<String, String> emptyMap = new HashMap<>();
        assertEquals("https://www.example.com?key1=value1&key2=value2", urlBuilder.appendKeyVal(emptyMap).toString());
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue_NullInput() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        java.util.HashMap<String, String> nullMap = null;
        try {
            urlBuilder.appendKeyVal(nullMap);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue_ThrowsIllegalArgumentException() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        java.util.HashMap<String, String> emptyMap = new HashMap<>();
        try {
            urlBuilder.appendKeyVal(emptyMap);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue_NullInput_ThrowsIllegalArgumentException() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        java.util.HashMap<String, String> nullMap = null;
        try {
            urlBuilder.appendKeyVal(nullMap);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue_ThrowsIllegalArgumentException_NullInput() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String nullValue = "";
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue_ThrowsIllegalArgumentException_EmptyInput() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String emptyValue = "";
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}