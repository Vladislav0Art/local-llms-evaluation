package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_WithEmptyMap_Summary {

    @Test
    public void testAppendKeyVal_WithEmptyMap_Summary() {
        AppendKeyValRequest request = new AppendKeyValRequest();
        String summary = urlBuilder.build().appendKeyVal(request).summary();
        assertEquals("null", summary);
    }

}