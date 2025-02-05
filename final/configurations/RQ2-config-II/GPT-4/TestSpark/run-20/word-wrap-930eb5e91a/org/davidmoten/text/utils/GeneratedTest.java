package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        final Reader reader = new StringReader("");
        final WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        final WordWrap.Builder builder = WordWrap.fromClasspathUtf8("test/resource");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() {
        final WordWrap.Builder builder = WordWrap.fromClasspath("test/resource", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        final WordWrap.Builder builder = WordWrap.from("This is a test text.");
        assertNotNull(builder);
    }

    @Test
    public void fromUtf8Test() {
        final WordWrap.Builder builder = WordWrap.fromUtf8(System.in);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamTest() {
        final WordWrap.Builder builder = WordWrap.from(System.in, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromFileTest() throws FileNotFoundException {
        final WordWrap.Builder builder = WordWrap.from(new File("non_existent_file.txt"), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void closeReaderTest() {
        final Reader reader = new StringReader("");
        WordWrap.close(reader);
        assertTrue(true); // If it doesn't throw an exception, the test passes.
    }

    @Test
    public void rightTrimTest() {
        final CharSequence trimmed = WordWrap.rightTrim(" This text has extra spaces at the end.   ");
        assertEquals(" This text has extra spaces at the end.", trimmed.toString());
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("     "));
        assertFalse(WordWrap.isWhitespace("not_whitespace"));
    }

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        final Reader input = new StringReader("This is a long text to be wrapped.");
        final StringWriter output = new StringWriter();
        WordWrap.wordWrap(input, output, "\n", 10, CharSequence::length, new HashSet<>(), false, false);
        assertTrue(output.toString().split("\n").length > 1);
    }

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        final Reader input = new StringReader("This is another long text to be wrapped.");
        final StringWriter output = new StringWriter();
        WordWrap.wordWrap(input, output::write, 10, CharSequence::length, new HashSet<>(), false, false);
        assertTrue(output.toString().split("\n").length > 1);
    }

}