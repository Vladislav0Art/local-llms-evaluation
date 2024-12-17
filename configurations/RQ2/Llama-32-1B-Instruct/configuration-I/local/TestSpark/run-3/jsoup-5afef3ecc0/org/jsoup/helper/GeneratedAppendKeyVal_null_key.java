package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyVal_null_key {

    @Test
    public void appendKeyVal_null_key() {
        String key = null;
        String value = "bar";

        UrlBuilder builder = new UrlBuilder(new MockHttpUrl("https://example.com", mockConnection()));
        try {
            builder.appendKeyVal(value);
            assertNull(builder.get());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}