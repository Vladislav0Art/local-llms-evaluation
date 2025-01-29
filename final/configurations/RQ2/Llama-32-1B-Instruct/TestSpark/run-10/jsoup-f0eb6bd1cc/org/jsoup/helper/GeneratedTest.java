package org.jsoup.helper;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void test1() throws UnsupportedEncodingException {
        String encoded = DataUtil.encode(new URL("https://example.com"));
        assertEquals(encoded, "https%3A//example.com%2F");
    }

    @Test
    public void test2() throws UnsupportedEncodingException {
        String expected = "expected";
        String actual = DataUtil.encode(new URL("https://example.com"));
        if (!actual.equals(expected)) {
            fail("Expected exception not thrown");
        }
    }

    @Test
    public void test3() {
        try {
            new URL("https://example.com").toURI();
        } catch (UnsupportedEncodingException e) {
            // ignore
        }
    }

    @Test
    public void test4() throws UnsupportedEncodingException {
        String encoded = DataUtil.encode(new URL("https://example.com"));
        System.out.println(encoded);
    }

    @Test
    public void test5() {
        try {
            new java.net.URL("https://example.com").toURI();
        } catch (java.net.URISyntaxException e) {
            // ignore
        }
    }

    @Test
    public void test6() throws UnsupportedEncodingException {
        String expected = "expected";
        String actual = DataUtil.encode(new URL("https://example.com"));
        if (!actual.equals(expected)) {
            fail("Expected exception not thrown");
        }
    }

    @Test
    public void test7() throws UnsupportedEncodingException {
        String encoded = DataUtil.encode(new java.net.URL("https://example.com"));
        System.out.println(encoded);
    }

}