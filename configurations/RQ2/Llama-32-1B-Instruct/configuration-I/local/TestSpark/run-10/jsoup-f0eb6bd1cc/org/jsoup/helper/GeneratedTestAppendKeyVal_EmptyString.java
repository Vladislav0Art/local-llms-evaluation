package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_EmptyString {

    @Test
    public void testAppendKeyVal_EmptyString() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

}