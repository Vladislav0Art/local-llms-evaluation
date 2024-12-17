package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValEmptySlice {

    @Test
    public void testAppendKeyValEmptySlice() throws UnsupportedEncodingException {
        Builder<String> builder = new Builder<>(new URL("http://example.com/path?value"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

}