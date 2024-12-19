package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void build_MakeUrlWithPunyCodingAndQueryStringTest() {
        URL u = new URL("http://example.com/path?query=string#anchor");
        UrlBuilder builder = new UrlBuilder(u);
        URL normalizedUrl = builder.build();
        // Test expected normalized URL
    }

    @Test
    public void build_MakeUrlWithPunyCodingAndFragmentTest() {
        URL u = new URL("http://example.com/path?query=string#anchor");
        UrlBuilder builder = new UrlBuilder(u);
        URL normalizedUrl = builder.build();
        // Test expected normalized URL with fragment
    }

    @Test
    public void build_MakeUrlWithNonAsciiPathComponentTest() {
        String path = "\u00A0\u00B1"; // Non-ASCII space
        URL u = new URL("http://example.com/path?" + path);
        UrlBuilder builder = new UrlBuilder(u);
        URL normalizedUrl = builder.build();
        // Test expected normalized URL with non-ASCII path component
    }

    @Test
    public void build_ThrowMalformedURLExceptionTest() {
        try {
            UrlBuilder.builder(new URL("invalid://url"));
            assert false;
            assert true; // should never reach here
        } catch (MalformedURLException e) {
            // Test that the correct exception is thrown
        }
    }

    @Test
    public void appendKeyVal_AddKeyValPairToUrlQueryStringTest() {
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal queryKeyVal[] = new Connection.KeyVal[]{kv};
        builder.appendKeyVal(queryKeyVal);
        // Test expected normalized URL with key-value pair
    }

    @Test
    public void appendKeyVal_AddMultipleKeyValPairsToUrlQueryStringTest() {
        KeyVal kv1 = new KeyVal("key1", "value1");
        KeyVal kv2 = new KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal queryKeyVal[] = new Connection.KeyVal[]{kv1, kv2};
        builder.appendKeyVal(queryKeyVal);
        // Test expected normalized URL with multiple key-value pairs
    }

    @Test
    public void decodePart_DecodeUrlEncodedStringTest() {
        String encoded = "Hello%20World!";
        String decoded = UrlBuilder.decodePart(encoded);
        assert decoded.equals("Hello World!");
    }

    @Test
    public void appendToAscii_NormalizePathComponentWithNonASCIICharactersTest() {
        StringBuilder sb = new StringBuilder();
        String path = "\u00A0\u00B1";
        UrlBuilder.appendToAscii(path, true, sb);
        // Test expected normalized path component
    }

    @Test
    public void appendToAscii_NormalizePathComponentWithASCIICharactersTest() {
        StringBuilder sb = new StringBuilder();
        String path = "Hello World!";
        UrlBuilder.appendToAscii(path, false, sb);
        // Test expected normalized path component
    }

}