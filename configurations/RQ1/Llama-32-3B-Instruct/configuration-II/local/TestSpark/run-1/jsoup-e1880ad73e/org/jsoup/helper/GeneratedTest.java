package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void [UrlBuilder_getProtocol]

    Test() {
        String url = "http://example.com/path?query=value";
        String expectedProtocol = "http";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedProtocol, builder.u.getProtocol());
    }

    @Test
    public void [UrlBuilder_getUserInfo]

    Test() {
        String url = "http://user:pass@example.com/path?query=value";
        String expectedUserInfo = "user:pass";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedUserInfo, builder.u.getUserInfo());
    }

    @Test
    public void [UrlBuilder_getHost]

    Test() {
        String url = "http://example.com/path?query=value";
        String expectedHost = "example.com";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedHost, builder.decodePart(builder.u.getHost()));
    }

    @Test
    public void [UrlBuilder_getPort]

    Test() {
        String url = "http://example.com:8080/path?query=value";
        int expectedPort = 8080;
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedPort, builder.u.getPort());
    }

    @Test
    public void [UrlBuilder_getPath]

    Test() {
        String url = "http://example.com/path?query=value";
        String expectedPath = "/path";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedPath, builder.decodePart(builder.u.getPath()));
    }

    @Test
    public void [UrlBuilder_build]

    Test() {
        String url = "http://example.com/path?query=value";
        URL expectedU = new URL("http://" + "example.com" + "/path");
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedU, builder.u);
    }

    @Test
    public void [UrlBuilder_buildWithQuery]

    Test() {
        String url = "http://example.com/path?query=value";
        String expectedNormUrl = "http://example.com/path?query=value";
        URL expectedU = new URL(expectedNormUrl);
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedU, builder.u);
    }

    @Test
    public void [UrlBuilder_buildWithRef]

    Test() {
        String url = "http://example.com/path?query=value#anchor";
        String expectedNormUrl = "http://example.com/path?query=value#anchor";
        URL expectedU = new URL(expectedNormUrl);
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedU, builder.u);
    }

    @Test
    public void [UrlBuilder_appendKeyVal]

    Test() {
        String url = "http://example.com/path?query=value";
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL(url));
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("http://example.com/path?query=value&key=value&key2=value2", builder.q.toString());
    }

    @Test
    public void [UrlBuilder_appendToAscii]

    Test() {
        String s = "äöü";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(s, true, sb);
        assertEquals("%C3%A4%C3%B6%C3%BC", sb.toString());
    }

    @Test
    public void [UrlBuilder_appendToAsciiWithSpace]

    Test() {
        String s = "äöü ";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(s, true, sb);
        assertEquals("%C3%A4%C3%B6%C3%BC", sb.toString());
    }

}