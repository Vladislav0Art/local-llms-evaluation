package org.jsoup.helper;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class GeneratedTest1 {

    @Test
    public void test1() throws UnsupportedEncodingException {
        String encoded = DataUtil.encode(new URL("https://example.com"));
        assertEquals(encoded, "https%3A//example.com%2F");
    }

}