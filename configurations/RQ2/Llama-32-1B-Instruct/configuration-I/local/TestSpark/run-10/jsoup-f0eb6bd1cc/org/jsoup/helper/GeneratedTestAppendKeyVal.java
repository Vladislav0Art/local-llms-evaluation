package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = null;
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);
        when(builder.appendKeyVal(kv2)).thenReturn(false);

        String[] expectedValues = {"key1=value1", "key2=value2"};
        String actualValues = builder.appendKeyVal(kv1, kv2).toString();
        assertEquals(expectedValues, actualValues);
    }

}