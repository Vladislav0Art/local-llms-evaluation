package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new BufferedReader(new StringReader("Test string"))));
    }

    @Test
    public void fromReaderCloseTest() {
        assertNotNull(WordWrap.from(new BufferedReader(new StringReader("Test string")), true));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("test.txt"));
    }

    @Test
    public void fromClasspathCharsetTest() {
        assertNotNull(WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("Test string"));
    }

    @Test
    public void fromUtf8Test() {
        ByteArrayInputStream testInput = new ByteArrayInputStream("Test string".getBytes());
        assertNotNull(WordWrap.fromUtf8(testInput));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        ByteArrayInputStream testInput = new ByteArrayInputStream("Test string".getBytes());
        assertNotNull(WordWrap.from(testInput, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharsetNotFoundTest() {
        WordWrap.from(new File("non_existent_file.txt"), StandardCharsets.UTF_8);
    }

    @Test
    public void closeTest() {
        WordWrap.close(new BufferedReader(new StringReader("Test string")));
    }

    @Test
    public void rightTrimTest() {
        assertEquals("Test  ", WordWrap.rightTrim("Test  "));
        assertEquals("Test", WordWrap.rightTrim("Test"));
        assertEquals("Test", WordWrap.rightTrim("Test "));
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("Test"));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2();
        word.append("  Test");
        WordWrap.leftTrim(word);
        assertEquals("Test", word.toString());
    }

    @Test
    public void wordWrapReaderTest() throws IOException {
        StringWriter writer = new StringWriter();
        BufferedReader reader = new BufferedReader(new StringReader("WordWrap.wordWrap test"));
        Set<Character> extraWordChars = new HashSet<Character>() {{
            add('-');
        }};
        WordWrap.wordWrap(reader, writer, "\n", 10, CharSequence::length, extraWordChars, false, false);
        assertEquals("WordWrap\n.wordWrap\ntest\n", writer.toString());
    }

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        StringWriter writer = new StringWriter();
        BufferedReader reader = new BufferedReader(new StringReader("WordWrap.wordWrap test"));
        LineConsumer lineConsumer = new StringWriterLineConsumer(writer);
        Set<Character> extraWordChars = new HashSet<Character>() {{
            add('-');
        }};
        WordWrap.wordWrap(reader, lineConsumer, 10, CharSequence::length, extraWordChars, false, false);
        assertEquals("WordWrap\n.wordWrap\ntest\n", writer.toString());
    }

}