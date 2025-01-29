package org.jsoup.helper;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class GeneratedTest6 {

    @Test
    public void test6() throws UnsupportedEncodingException {
        String expected = "expected";
        String actual = DataUtil.encode(new URL("https://example.com"));
        if (!actual.equals(expected)) {
            fail("Expected exception not thrown");
        }
    }

}