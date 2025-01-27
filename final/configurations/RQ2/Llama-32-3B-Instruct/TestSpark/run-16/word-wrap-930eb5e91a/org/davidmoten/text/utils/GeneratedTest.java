package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromClasspathUtf8_builderCreated() throws IOException {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("hello.world");
        assertNotNull(builder);
    }

    @Test
    public void fromCharSequence_builderCreated() {
        WordWrap.Builder builder = WordWrap.from("Hello World");
        assertNotNull(builder);
    }

    @Test
    public void isWhitespace_returnsFalseForNonWhitespaceCharacter() {
        assertFalse(WordWrap.isWhitespace("\u0009"));
    }

    @Test
    public void fromReader_builderCreated() {
        String input = "Hello World";
        WordWrap.Builder builder = WordWrap.from(input);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8_builderCreated() throws IOException {
        String input = "hello.world";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(input);
        assertNotNull(builder);
    }

    @Test
    public void testFromClasspathUtf8() {
        String input = "Hello World";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(input);
        assertNotNull(builder);
    }

    @Test
    public void testRightTrim() {
        String input = "   Hello World  ";
        assertEquals("Hello World", WordWrap.rightTrim(input));
    }

}