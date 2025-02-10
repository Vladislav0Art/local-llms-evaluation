package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValueWithEncodedValue {

    @Test
    public void appendKeyValueWithEncodedValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", URLEncoder.encode("value", DataUtil.UTF_8));
        when(new String(kv.getKey())).thenReturn("key");
        when(new String(kv.getValue())).thenReturn(IDN.toUTF8(URLEncoder.encode("value", DataUtil.UTF_8)));
        UrlBuilder builder = new UrlBuilder(null);
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}