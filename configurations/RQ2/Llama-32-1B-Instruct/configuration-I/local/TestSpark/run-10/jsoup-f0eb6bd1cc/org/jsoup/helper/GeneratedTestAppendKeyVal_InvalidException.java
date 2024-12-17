package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_InvalidException {

    @Test
    public void testAppendKeyVal_InvalidException() {
        Connection.KeyVal kv1 = null;
        Connection.KeyVal kv2 = new String();
        builder = new UrlBuilder("https://example.com");
        when(builder.appendKeyVal(kv1)).thenReturn(true);

        try {
            builder.appendKeyVal(kv1, kv2);
            fail("Expected exception");
        } catch (UnsupportedEncodingException e) {
        }

        try {
            builder.appendKeyVal(kv1, kv2);
            fail("Expected exception");
        } catch (UnsupportedEncodingException e) {
        }
    }

}