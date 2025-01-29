package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal_WithEmptyMap_Summary() {
        AppendKeyValRequest request = new AppendKeyValRequest();
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("null", summary);
    }

    @Test
    public void testAppendKeyVal_WithValidMap_Summary() {
        AppendKeyValRequest kv1 = new AppendKeyValRequest(kv1Value);
        URLBuilder.AppendKeyValRequest request = new URLBuilder().appendKeyVal(kv1);
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("key1=value1", summary);
    }

    @Test
    public void testAppendS_WithEmptyMap_Summary() {
        AppendSRequest request = new AppendSRequest();
        String summary = urlBuilder.build().appendS(request).summary();
        assertEquals("s1=value1", summary);
    }

    @Test
    public void testAppendS_WithValidMap_Summary() {
        AppendSRequest s2 = new AppendSRequest(s2Value);
        URLBuilder.AppendSRequest request = new URLBuilder().appendS(s2);
        String summary = urlBuilder.build().appendS(request).summary();
        assertEquals("key1=value1", summary);
    }

    public static class AppendKeyValRequest {
        private final Map<String, String> kv1;

        public AppendKeyValRequest(Map<String, String> kv1) {
            this.kv1 = kv1;
        }
    }

    public static class AppendSRequest {
        private final String s2Value;

        public AppendSRequest(String s2Value) {
            this.s2Value = s2Value;
        }
    }

    @Test
    public void testAppendKeyVal_Summary() {
        Map<String, String> kv1 = new HashMap<>();
        kv1.put("key1", "value1");
        AppendKeyValRequest request = new AppendKeyValRequest(kv1);
        URLBuilder.AppendKeyValRequest builder = new URLBuilder();
        String summary = builder.build().appendKeyVal(request).summary();
        assertEquals("key1=value1", summary);
    }

    @Test
    public void testAppendS_Summary() {
        String s2Value = "s2_value";
        AppendSRequest request = new AppendSRequest(s2Value);
        URLBuilder.AppendSRequest builder = new URLBuilder();
        String summary = builder.build().appendS(request).summary();
        assertEquals("s2_value", summary);
    }

    public static class Map<K, V> {
        private final Map<K, V> map;

        public Map() {
            this.map = new HashMap<>();
        }
    }

    public static class HashMap extends Map<String, String> {
    }

    @Test
    public void testAppendKeyVal_Summary() {
        Map<String, String> kv1 = new HashMap<>() {{
            put("key1", "value1");
        }};

        AppendKeyValRequest request = new AppendKeyValRequest(kv1);
        URLBuilder.AppendKeyValRequest builder = new URLBuilder();
        String summary = builder.build().appendKeyVal(request).summary();
        assertEquals("value1", summary);
    }

    @Test
    public void testAppendS_Summary() {
        HashMap map = new HashMap<>() {{
            put("s2_value", "s2_value");
        }};

        AppendSRequest request = new AppendSRequest(map.get("s2_value"));
        URLBuilder.AppendSRequest builder = new URLBuilder();
        String summary = builder.build().appendS(request).summary();
        assertEquals("s2_value", summary);
    }

    public static class String {
        private final String s2Value;

        public String(String s2Value) {
            this.s2Value = s2Value;
        }
    }

    @Test
    public void testAppendKeyVal_Summary() {
        Map<String, String> kv1 = new HashMap<>();
        kv1.put("key1", "value1");
        AppendKeyValRequest request = new AppendKeyValRequest(kv1);
        URLBuilder.AppendKeyValRequest builder = new URLBuilder();
        String summary = builder.build().appendKeyVal(request).summary();
        assertEquals("value1", summary);
    }

    @Test
    public void testAppendS_Summary() {
        String s2Value = "s2_value";
        AppendSRequest request = new AppendSRequest(s2Value);
        URLBuilder.AppendSRequest builder = new URLBuilder();
        String summary = builder.build().appendS(request).summary();
        assertEquals("s2_value", summary);
    }

}