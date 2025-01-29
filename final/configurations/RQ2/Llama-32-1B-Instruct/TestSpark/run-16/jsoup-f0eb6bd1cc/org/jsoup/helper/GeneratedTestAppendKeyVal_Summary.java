package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_Summary {

    @Test
    public void testAppendKeyVal_Summary() {
        Map<String, String> kv1 = new HashMap<>();
        kv1.put("key1", "value1");
        AppendKeyValRequest request = new AppendKeyValRequest(kv1);
        URLBuilder.AppendKeyValRequest builder = new URLBuilder();
        String summary = builder.build().appendKeyVal(request).summary();
        assertEquals("value1", summary);
    }

}