package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void urlBuilderUrl() {
        String inputUrl = "https://example.com";
        URL outputUrl = new URLBuilder(inputUrl).build();
        assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void urlBuilderKeyValString() {
        Map<String, String> kv = new HashMap<>();
        String encodedKv = URLEncoder.encode(String.valueOf(kv), "UTF-8");
        assertNotEquals("https://example.com?k=1&v=2", new URLBuilder().appendKeyVal(kv));
    }

    @Test
    public void urlBuilderKeyValStringUnquoted() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        assertEquals("https://example.com?key=value", new URLBuilder().appendKeyVal(kv));
    }

    @Test
    public void urlBuilderKeyValDouble() {
        double d = 3.14;
        assertNotEquals("https://example.com?k=2&v=3.14", new URLBuilder().appendKeyVal(Map.of("k", String.valueOf(d), "v", String.valueOf(d))));
    }

    @Test
    public void urlBuilderKeyValList() {
        List<String> list = Arrays.asList("a", "b");
        assertEquals("https://example.com?a=b", new URLBuilder().appendKeyVal(list));
    }

    @Test
    public void urlBuilderKeyValListUnquoted() {
        List<String> list = Arrays.asList("key1", "value1");
        assertEquals("https://example.com?k=1&v=value1", new URLBuilder().appendKeyVal(list));
    }

    @Test
    public void urlBuilderKeyValEmptyList() {
        String inputUrl = "https://example.com";
        Map<String, String> kv = new HashMap<>();
        String encodedKv = URLEncoder.encode(String.valueOf(kv), "UTF-8");
        assertEquals(inputUrl, new URLBuilder().appendKeyVal(kv));
    }

    @Test
    public void urlBuilderNoAppend() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotSame(urlBuilder.build(), null);
        assertNotSame(urlBuilder.appendKeyVal(null), null);
    }

}