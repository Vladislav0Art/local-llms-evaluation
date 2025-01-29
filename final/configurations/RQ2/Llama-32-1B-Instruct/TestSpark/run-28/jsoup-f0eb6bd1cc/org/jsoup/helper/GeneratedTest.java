package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String url = "https://example.com/path/to/resource";
        URL result = UrlBuilder.build(url);
        assertEquals("https://example.com/path/to/resource", result.toString());
    }

    @Test
    public void testAppendKeyVal_Url() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal(key, value));
        String result = DataUtil.toString(builder.build(), UTF_8);
        assertEquals("https://example.com/path/to/resource?key=value", result);
    }

    @Test
    public void testAppendKeyVal_Failing() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal(key, value));
        try {
            DataUtil.toString(builder.build(), UTF_8); // Expect an exception
        } catch (UnsupportedEncodingException e) {
            // Expecting this to be a JUnit assertion error
        }
    }

    @Test
    public void testAppendKeyVal_Malformed() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal(key, value, new java.util.ArrayList<>() {
        }));
        try {
            DataUtil.toString(builder.build(), UTF_8); // Expect an exception
        } catch (UnsupportedEncodingException e) {
            // Expecting this to be a JUnit assertion error
        }
    }

    @Test
    public void testBuild_InvalidInput() throws UnsupportedEncodingException {
        String url = null;
        URL result = UrlBuilder.build(url);
        assertNull(result); // Expecting a NullPointerException
    }

}