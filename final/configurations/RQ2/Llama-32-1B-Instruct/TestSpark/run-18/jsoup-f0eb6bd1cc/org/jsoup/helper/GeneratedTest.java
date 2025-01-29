package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTest {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuild_EmptyInputUrl() {
        String inputUrl = "";
        assertEquals("", urlBuilder.build());
    }

    @Test
    public void testBuild_PartiallyConstructedURL_WithoutKeyVal() {
        String inputUrl = "http://example.com/path";
        URL actual = urlBuilder.build();
        assertEquals(inputUrl, actual.toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToDecodeURL() throws UnsupportedEncodingException {
        // Fails to decode URL when key is null
        String inputUrl = "http://example.com/path";
        String expectedOutput = "https://example.com/path?a%3D1";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeURL() throws UnsupportedEncodingException {
        // Fails to encode URL when key is null
        String inputUrl = "http://example.com/path?%a%3D1";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialChars() throws UnsupportedEncodingException {
        // Fails to encode special chars when key is null
        String inputUrl = "http://example.com/path?%a=1";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialChars() throws UnsupportedEncodingException {
        // Fails to encode special chars when key is null
        String inputUrl = "http://example.com/path?%a=1&b=c";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space when key is null
        String inputUrl = "http://example.com/path? a%20b";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space when key is null
        String inputUrl = "http://example.com/path? a%20b&c";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithSpaceAndSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space and another space when key is null
        String inputUrl = "http://example.com/path? a%20b%2Cc";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceChar() throws UnsupportedEncodingException {
        // Fails to encode special chars with non-space char when key is null
        String inputUrl = "http://example.com/path? a%3D1";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceChar() throws UnsupportedEncodingException {
        // Fails to encode special chars with non-space char when key is null
        String inputUrl = "http://example.com/path? a%3D1&b";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceCharAndSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space and non-space char when key is null
        String inputUrl = "http://example.com/path? a%20b&c";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceCharAndSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space and non-space char when key is null
        String inputUrl = "http://example.com/path? a%3D1&b";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

}