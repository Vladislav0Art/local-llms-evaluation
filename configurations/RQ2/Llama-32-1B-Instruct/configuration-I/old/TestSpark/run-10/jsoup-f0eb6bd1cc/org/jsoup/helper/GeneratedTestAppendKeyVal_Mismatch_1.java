package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_Mismatch_1 {

    @Test
    public void testAppendKeyVal_Mismatch_1() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {"key1=value1", "key2=value3"};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

}