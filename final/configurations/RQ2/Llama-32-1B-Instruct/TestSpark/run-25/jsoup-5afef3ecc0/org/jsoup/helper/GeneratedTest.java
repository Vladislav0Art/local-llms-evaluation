package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(new URL(inputUrl));
        URL url = builder.build();
        assertNotNull(url);
        assertEquals("https://example.com/path/to/resource", url.toString());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String inputKey = "key";
        String inputValue = "value";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(new org.jsoup.KeyVal(inputKey, inputValue));
        String expectedUrl = "https://example.com?key=value";
        assertEquals(expectedUrl, builder.build().toString());
    }

    @Test
    public void testAppendKeyValMalformed() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValNullValue() throws UnsupportedEncodingException {
        String inputKey = "key";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(null);
        fail("Expected NullPointerException");
    }

    @Test
    public void testBuildWithUrlConnection() {
        String inputUrl = "https://example.com/path/to/resource";
        Connection.KeyVal kv1 = new org.jsoup.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new org.jsoup.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        try {
            URL url = builder.build();
            assertNotNull(url);
            assertEquals("https://example.com/path/to/resource?key1=value1&key2=value2", url.toString());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValWithNonStringValue() throws UnsupportedEncodingException {
        String inputKey = "key";
        int value = 123;
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(value);
        fail("Expected UnsupportedEncodingException");
    }

    @Test
    public void testAppendKeyValWithNull() throws UnsupportedEncodingException {
        String inputKey = "key";
        int value = null;
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(value);
        fail("Expected NullPointerException");
    }

}