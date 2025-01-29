package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_WithValidMap_Summary {

    @Test
    public void testAppendKeyVal_WithValidMap_Summary() {
        AppendKeyValRequest kv1 = new AppendKeyValRequest(kv1Value);
        URLBuilder.AppendKeyValRequest request = new URLBuilder().appendKeyVal(kv1);
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("key1=value1", summary);
    }

}