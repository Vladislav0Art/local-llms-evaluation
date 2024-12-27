package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.EnumSet;

public class GeneratedAppendKeyVal_withNullValueAndNullKey {

    @Test
    public void appendKeyVal_withNullValueAndNullKey() {
        Connection.KeyVal kv = Connection.KeyVal.create(null, null);
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}