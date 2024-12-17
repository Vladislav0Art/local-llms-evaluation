package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullSlice {

    @Test
    public void testAppendKeyValNullSlice() throws UnsupportedEncodingException {
        Builder<String> builder = new Builder<>(new URL("http://example.com/path"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

}