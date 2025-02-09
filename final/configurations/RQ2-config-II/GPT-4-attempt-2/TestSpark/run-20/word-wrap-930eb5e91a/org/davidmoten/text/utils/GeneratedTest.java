package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertTrue(WordWrap.from(new StringReader("test")) instanceof WordWrap.Builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertTrue(WordWrap.fromClasspathUtf8("resource") instanceof WordWrap.Builder);
    }

    @Test
    public void fromClasspathCharsetTest() {
        assertTrue(WordWrap.fromClasspath("resource", StandardCharsets.UTF_8) instanceof WordWrap.Builder);
    }

    @Test
    public void fromCharSequenceTest() {
        assertTrue(WordWrap.from("test") instanceof WordWrap.Builder);
    }

    @Test
    public void fromUtf8Test() {
        InputStream testInput = new ByteArrayInputStream("test".getBytes(StandardCharsets.UTF_8));
        assertTrue(WordWrap.fromUtf8(testInput) instanceof WordWrap.Builder);
    }

    @Test
    public void fromCharsetTest() {
        InputStream testInput = new ByteArrayInputStream("test".getBytes(StandardCharsets.UTF_8));
        assertTrue(WordWrap.from(testInput, StandardCharsets.UTF_8) instanceof WordWrap.Builder);
    }

    @Test
    public void fromFileCharsetTest() {
        File testFile = new File("src/test/resources/test.txt");
        assertTrue(WordWrap.from(testFile, StandardCharsets.UTF_8) instanceof WordWrap.Builder);
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
    }

    @Test
    public void isNotWhitespaceTest() {
        assertTrue(!WordWrap.isWhitespace("a"));
    }

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim("  test  ");
        assertEquals("  test", result);
    }

    @Test
    public void wordWrapTest() throws IOException {
        HashSet<Character> extraWordChars = new HashSet<>();
        extraWordChars.add(',');
        Function<CharSequence, Integer> testStringWidth = sequence -> sequence.length();
        WordWrap.wordWrap(new StringReader("This is a test"), new StringWriter(), "\n", 80,
                testStringWidth, extraWordChars, true, true);
    }

}