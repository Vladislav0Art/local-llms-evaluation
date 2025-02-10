package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValNoEncoding {

    @Test
    public void appendKeyValNoEncoding() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        when(new String(kv.getKey())).thenReturn("key");
        when(new String(kv.getValue())).thenReturn("value");
        UrlBuilder builder = new UrlBuilder(null);
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}