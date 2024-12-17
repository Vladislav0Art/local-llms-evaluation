package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullRefSlice {

    @Test
    public void testAppendKeyValNullRefSlice() throws UnsupportedEncodingException {
        Builder<URI> builder = new Builder<>(new URL("http://example.com/path"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

}