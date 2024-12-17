package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyVal_not_null {

    @Test
    public void appendKeyVal_not_null() {
        String key = "foo";
        String value = "bar";

        UrlBuilder builder = new UrlBuilder(new MockHttpUrl("https://example.com", mockConnection()));
        try {
            builder.appendKeyVal(null);
            assertNull(builder.get());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}