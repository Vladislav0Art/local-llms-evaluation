package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal_Mismatch {

    @Test
    public void testAppendKeyVal_Mismatch() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        String[] expectedValues = {"key1=value1", "key2=value3"};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

}