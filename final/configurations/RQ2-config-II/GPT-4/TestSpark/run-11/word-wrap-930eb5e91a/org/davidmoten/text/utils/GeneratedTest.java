package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromWithReaderTest() throws FileNotFoundException {
        String testInput = "Hello world.";
        Reader reader = new StringReader(testInput);
        assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "textFile";
        assertNotNull(WordWrap.fromClasspathUtf8(resource));
    }

    @Test
    public void fromClasspathWithCharsetTest() {
        String resource = "textFile";
        assertNotNull(WordWrap.fromClasspath(resource, StandardCharsets.UTF_8));
    }

    @Test
    public void fromWithCharSequenceTest() {
        CharSequence text = "Hello world.";
        assertNotNull(WordWrap.from(text));
    }

    @Test
    public void fromUtf8Test() throws FileNotFoundException {
        File file = new File("testFile");
        InputStream in = new FileInputStream(file);
        assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromInputStreamWithCharsetTest() throws FileNotFoundException {
        File file = new File("testFile");
        InputStream in = new FileInputStream(file);
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileWithCharsetTest() {
        File file = new File("testFile");
        assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

    @Test
    public void isWhitespaceTest() {
        CharSequence s = "   ";
        assertTrue(WordWrap.isWhitespace(s));
    }

    @Test
    public void rightTrimTest() {
        CharSequence s = "  Hello   ";
        assertEquals("  Hello", WordWrap.rightTrim(s));
    }

    @Test
    public void wordWrapTest() throws IOException {
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('.');
        Function<CharSequence, Number> stringWidth = str -> ((CharSequence) str).length();
        try (StringWriter out = new StringWriter()) {
            try (StringReader in = new StringReader("Hello world.")) {
                WordWrap.wordWrap(in, out, "\n", 5, stringWidth, extraWordChars,
                        false, false);
                assertEquals("Hello\nworld.", out.toString());
            }
        }
    }

    @Test
    public void leftTrimTest() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InstantiationException {
        StringBuilder str = new StringBuilder("       Hello");
        org.davidmoten.text.utils.WordWrap.getClass().getMethod("leftTrim", StringBuilder.class).invoke(null, str);
        assertEquals("Hello", str.toString());
    }

}