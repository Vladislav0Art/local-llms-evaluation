package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testUrlBuilderConstructor_InvalidProtocol() {
        URL url = new URL("invalid: protocol");
        assertThrows(MalformedURLException.class, () -> UrlBuilder.builder(url));
    }

    @Test
    public void testUrlBuilderConstructor_EmptyHost() {
        String url = "";
        assertThrows(MalformedURLException.class, () -> UrlBuilder.builder(new java.net.URL(url)));
    }

    @Test
    public void testUrlBuilderConstructor_FailedHostEncoding() {
        String url = "invalid: host";
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.builder(new URL(url)));
    }

    @Test
    public void testUrlBuilderAppendKeyVal_SimpleKeyValue() {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample.com%3A0key%3A1", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_WithSpaces() {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample.com%2Fkey%20value", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_EmptyString() {
        String key = "";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample.com", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_NullString() {
        String key = null;
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample.com", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_WithInvalidChars() {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample%20com", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_PresentEscape() {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample%28com%29", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_PresentEscapeInFragment() {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com#fragment"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample%28com%29#fragment", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_PresentEscapeInFragmentWithoutDot() {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com/fragment"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample%28com%29%2Fragment", builder.build().toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_PresentEscapeInAnchor() {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com#anchor"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample%28com%29#anchor", builder.build().toString());
    }

}