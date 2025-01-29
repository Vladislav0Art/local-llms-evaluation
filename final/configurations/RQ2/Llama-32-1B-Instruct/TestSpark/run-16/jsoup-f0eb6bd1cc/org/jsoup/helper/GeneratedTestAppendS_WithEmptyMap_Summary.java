package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendS_WithEmptyMap_Summary {

    @Test
    public void testAppendS_WithEmptyMap_Summary() {
        AppendSRequest request = new AppendSRequest();
        String summary = urlBuilder.build().appendS(request).summary();
        assertEquals("s1=value1", summary);
    }

}