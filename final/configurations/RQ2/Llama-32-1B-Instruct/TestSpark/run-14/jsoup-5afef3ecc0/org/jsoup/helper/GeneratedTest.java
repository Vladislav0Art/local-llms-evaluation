package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal_1() {
        HttpUrl url = new HttpUrl("https://example.com/path?key=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com/path?key=value", builder.build().toURI());
    }

    @Test
    public void testAppendKeyVal_2() {
        URL url = new URL("https://example.com/path?key=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com/path?key=value", builder.build().toURI());
    }

    @Test
    public void testAppendKeyVal_3() {
        URL url = null;
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(null, builder.build().toURI());
    }

    @Test
    public void testAppendKeyVal_4() {
        HttpUrl url = new HttpUrl("https://example.com/path?key=value");
        URL decodedUrl = decodeUrl(new HttpUrl("https://example.com/path?param=value").toString());
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(decodedUrl);
        assertEquals("https://example.com/path?key=value", builder.build().toURI());
    }

    @Test
    public void testAppendKeyVal_5() {
        HttpUrl url = new HttpUrl("https://example.com/path?param=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com/path?param=value&key=value", builder.build().toURI());
    }

    @Test
    public void testAppendKeyVal_6() {
        HttpUrl url = new HttpUrl("https://example.com/path?param=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(null, builder.build().toURI());
    }

    @Test
    public void testAppendKeyVal_7() {
        URL decodedUrl = decodeUrl(new HttpUrl("https://example.com/path?param=value").toString());
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(decodedUrl);
        assertEquals("https://example.com/path?key=value&param=value", decodedUrl.toString());
    }

    private String decodeUrl(String url) {
        try {
            return new URI(url).getScheme() + "://" + new URI(url).getAuthority() + "/" + new URI(url).getPath();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}