package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Assert.assertNotNull(WordWrap.from(new StringReader("example")));
    }

    @Test
    public void fromClasspathUtf8Test() {
        Assert.assertNotNull(WordWrap.fromClasspathUtf8("test-resource"));
    }

    @Test
    public void fromClasspathCharsetTest() {
        Assert.assertNotNull(WordWrap.fromClasspath("test-resource", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        Assert.assertNotNull(WordWrap.from("test string"));
    }

    @Test
    public void fromInputStreamUtf8TestNullCase() {
        WordWrap.fromUtf8(null);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        Assert.assertNotNull(WordWrap.from(System.in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharsetTestNullOrEmptyFile() {
        WordWrap.from(new File(""), StandardCharsets.UTF_8);
    }

    @Test
    public void isWhitespaceTestWhitespace() {
        Assert.assertTrue(WordWrap.isWhitespace(" "));
    }

    @Test
    public void isWhitespaceTestNonWhitespaceChar() {
        Assert.assertFalse(WordWrap.isWhitespace("x"));
    }

    @Test
    public void isWhitespaceTestEmptyString() {
        Assert.assertTrue(WordWrap.isWhitespace(""));
    }

    @Test
    public void isWhitespaceTestNullString() {
        WordWrap.isWhitespace(null);
    }

}