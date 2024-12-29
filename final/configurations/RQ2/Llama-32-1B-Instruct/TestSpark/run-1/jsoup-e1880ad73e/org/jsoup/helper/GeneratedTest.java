package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal_InitialState() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertEquals(null, urlBuilder.appendKeyVal(new java.util.HashMap<>()));
    }

    @Test
    public void testAppendKeyVal_SingleKey() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String key = "test";
        urlBuilder.appendKeyVal(java.util.Map.of(key, "value"));
        assertEquals("http://example.com/test=value", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_MultipleKeys() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String key1 = "test1";
        String key2 = "test2";
        urlBuilder.appendKeyVal(java.util.Map.of(key1, "value1", key2, "value2"));
        assertEquals("http://example.com/test1=value1/test2=value2", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_FailingEncoding() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("test1", "value1");
        map.put("test2", "value2");
        urlBuilder.appendKeyVal(map);
        assertEquals("http://example.com/test1=value1/test2=value2", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_FailingUTF8Encoding() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("test1", "value1");
        map.put("test2", "value2");
        URLDecoder decoder = org.json.JSONObject.class.getConstructor(String.class).newInstance(map.toString());
        Map<String, Object> resultMap = (Map<String, Object>) decoder.toString();
        assertEquals("http://example.com/test1=value1/test2=value2", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_FailingIDN() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("test1", "value1");
        map.put("test2", "value2");
        URL idnUrl = new URI("http://example.com/test1=value1/test2=value2", null);
        urlBuilder.appendKeyVal(idnUrl.toKeyVal());
        assertEquals("http://example.com/test1=value1/test2=value2", urlBuilder.build().toString());
    }

}