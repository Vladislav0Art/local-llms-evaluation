package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedTest {

    @Test
    public void buildNormalUrlTest() throws Exception {
        URL url = new URL("http://localhost:8080/test?query=abc&foo=bar#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(new URL("http://localhost:8080/test?query=abc%26foo=bar#fragment"), result, 1e-9);
    }

    @Test
    public void buildUrlWithEncodedQueryTest() throws Exception {
        URL url = new URL("http://localhost:8080/test?query=%3F%2Bfoo=bar#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(new URL("http://localhost:8080/test?query=%3F%2B%26foo=bar#fragment"), result, 1e-9);
    }

    @Test
    public void buildUrlWithNonAsciiPathTest() throws Exception {
        URL url = new URL("http://localhost:8080/ä%EF%BC%81test?query=%3F%2Bfoo=bar#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(new URL("http://localhost:8080/%C3%A4%FC%83%9C%83%8Etest?query=%3F%26%7C%2Bfoo=bar#fragment"), result, 1e-9);
    }

    @Test
    public void buildUrlWithEncodingProblemsTest() throws Exception {
        try {
            new UrlBuilder(new URL("http://localhost:8080/ä%EF%BC%81test?query=%3F%2Bfoo=bar#fragment"));
            fail();
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void appendKeyValWithEmptyQueryTest() throws Exception {
        KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://localhost:8080/test"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("%2C%26key=value", builder.q.toString());
    }

    @Test
    public void appendKeyValWithNonEmptyQueryTest() throws Exception {
        KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://localhost:8080/test?query=abc&foo=bar"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("%3F%26%7C%2Bkey=value", builder.q.toString());
    }
}

@Test
public void decodePartTest() throws Exception {
    assertEquals("ä€", UrlBuilder.decodePart("ä€"));
    try {
        UrlBuilder.decodePart(null);
        fail();
    } catch (UnsupportedEncodingException e) {
        // expected
    }
}

@Test
public void appendToAsciiTest() throws Exception {
    StringBuilder sb = new StringBuilder();
    UrlBuilder.appendToAscii("ä", false, sb);
    assertEquals("%C3%A4", sb.toString());
    UrlBuilder.appendToAscii("é", true, sb);
    assertEquals("%E2%82%AC", sb.toString());
}

@Test
public void appendToAsciiSpaceAsPlusTest() throws Exception {
    StringBuilder sb = new StringBuilder();
    UrlBuilder.appendToAscii("ä", false, sb);
    assertEquals("%C3%A4", sb.toString());
    UrlBuilder.appendToAscii("é", true, sb);
    assertEquals("%E2%82%AC", sb.toString());
}

}