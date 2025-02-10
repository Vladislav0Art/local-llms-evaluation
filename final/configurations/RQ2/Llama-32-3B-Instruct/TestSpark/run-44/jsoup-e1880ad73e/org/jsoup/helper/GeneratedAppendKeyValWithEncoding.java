package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValWithEncoding {

    @Test
    public void appendKeyValWithEncoding() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        when(new String(kv.getKey())).thenReturn("key");
        when(new String(kv.getValue())).thenReturn(IDN.toUTF8("value"));
        UrlBuilder builder = new UrlBuilder(null);
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}