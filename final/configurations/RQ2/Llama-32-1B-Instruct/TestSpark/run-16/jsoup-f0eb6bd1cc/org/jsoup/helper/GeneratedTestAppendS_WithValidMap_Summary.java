package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendS_WithValidMap_Summary {

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

}