package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendS_Summary {

    @Test
    public void testAppendS_Summary() {
        String s2Value = "s2_value";
        AppendSRequest request = new AppendSRequest(s2Value);
        URLBuilder.AppendSRequest builder = new URLBuilder();
        String summary = builder.build().appendS(request).summary();
        assertEquals("s2_value", summary);
    }

}