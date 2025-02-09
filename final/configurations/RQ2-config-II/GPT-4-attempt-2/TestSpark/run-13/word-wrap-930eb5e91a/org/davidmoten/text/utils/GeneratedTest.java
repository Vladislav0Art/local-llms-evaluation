package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Sample Text");
        WordWrap.Builder result = WordWrap.from(reader);
        assertTrue(result instanceof WordWrap.Builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder result = WordWrap.fromClasspathUtf8("samplePath");
        assertTrue(result instanceof WordWrap.Builder);
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder result = WordWrap.fromClasspath("samplePath", StandardCharsets.UTF_8);
        assertTrue(result instanceof WordWrap.Builder);
    }

    @Test
    public void fromSequenceTest() {
        WordWrap.Builder result = WordWrap.from("Sample Text");
        assertTrue(result instanceof WordWrap.Builder);
    }

    @Test
    public void fromNullInputStreamTest() {
        WordWrap.fromUtf8(null);
    }

    @Test
    public void fromEmptyCharsetTest() {
        WordWrap.from(new File("sample"), null);
    }

    @Test
    public void fromNonexistentFileTest() throws FileNotFoundException {
        WordWrap.from(new File("nonexistent"), Charset.defaultCharset());
    }

    @Test
    public void wordWrapInsertHyphensTest() throws IOException {
        String inputStr = "Java is an Object Oriented Programming Language predominantly used for building enterprise level applications.";
        Reader in = new StringReader(inputStr);
        Writer out = new StringWriter();
        Function<? super CharSequence, ? extends Number> stringWidth = input -> input.length();
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, "\n", 10, stringWidth, extraWordChars, true, false);
        assertTrue(out.toString().contains("-"));
    }

    @Test
    public void wordWrapBreakWordsTest() throws IOException {
        String inputStr = "Java is an Object Oriented Programming Language predominantly used for building enterprise level applications.";
        Reader in = new StringReader(inputStr);
        Writer out = new StringWriter();
        Function<? super CharSequence, ? extends Number> stringWidth = input -> input.length();
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, "\n", 10, stringWidth, extraWordChars, false, true);
        assertTrue(out.toString().contains("\n"));
    }

    @Test
    public void rightTrimTest() {
        CharSequence s = "    Test string    ";
        CharSequence result = WordWrap.rightTrim(s);
        assertEquals("    Test string", result.toString());
    }

    @Test
    public void isWhitespaceTest() {
        CharSequence s = "       ";
        boolean result = WordWrap.isWhitespace(s);
        assertTrue(result);
    }

}