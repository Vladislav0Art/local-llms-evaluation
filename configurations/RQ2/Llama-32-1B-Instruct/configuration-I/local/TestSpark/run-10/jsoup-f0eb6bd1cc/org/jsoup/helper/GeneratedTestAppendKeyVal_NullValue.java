package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_NullValue {

    @Test
    public void testAppendKeyVal_NullValue() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {"key1=value", "key2=value"};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

}