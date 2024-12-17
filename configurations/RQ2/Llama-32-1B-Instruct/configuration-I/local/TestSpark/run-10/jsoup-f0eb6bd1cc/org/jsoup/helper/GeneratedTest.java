package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String url = "https://example.com";
        when(url).thenReturn("url"); // Mock the URL to return a specific value
        Url actual = new UrlBuilder(url).build();
        assertEquals("url", actual);
    }

    @Test
    public void testAppendKeyVal_Mismatch_1() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {"key1=value1", "key2=value3"};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testAppendKeyVal_Mismatch_2() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {"key1=value", "key2=value"};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testAppendKeyVal_EmptyString() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testAppendKeyVal_NullValue() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {"key1=value", "key2=value"};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testAppendKeyVal_InvalidValueType() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = new String();
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testAppendKeyVal_InvalidException() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = new String();
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        try {
            builder.appendKeyVal(kv1, kv2);
            fail("Expected exception");
        } catch (UnsupportedEncodingException e) {
        }

        try {
            builder.appendKeyVal(kv1, kv2);
            fail("Expected exception");
        } catch (UnsupportedEncodingException e) {
        }
    }

}