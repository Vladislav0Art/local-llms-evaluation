package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void fromFileCharsetNonExistingFileTest() throws FileNotFoundException {
        WordWrap.from(new File("non-existing-file"), StandardCharsets.UTF_8);
    }

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder builder = WordWrap.from("hello world");
        assertEquals("Test", builder.toString());
    }

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream stream = new ByteArrayInputStream("hello world".getBytes(StandardCharsets.UTF_8));
        WordWrap.Builder builder = WordWrap.from(stream, StandardCharsets.UTF_8);
        assertEquals("Test", builder.toString());
    }

    @Test
    public void fromClasspathNullResourceTest() {
        WordWrap.fromClasspathUtf8(null);
    }

    @Test
    public void fromClasspathNullCharsetTest() {
        WordWrap.fromClasspath("resource", null);
    }

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim("   hello world    ");
        assertEquals("   hello world", result.toString());
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("   "));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 builder = new StringBuilder2("   hello world");
        WordWrap.leftTrim(builder);
        assertEquals("hello world", builder.toString());
    }

    @Test
    public void wordWrapTest() throws IOException {
        StringReader reader = new StringReader("hello world");
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(reader, writer, "\n", 80, s -> s.length(), new HashSet<>(), true, true);
        assertEquals("hello world", writer.toString());
    }

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        StringReader reader = new StringReader("hello world");
        StringWriter writer = new StringWriter();
        LineConsumer consumer = new WriterLineConsumer(new PrintWriter(writer));
        WordWrap.wordWrap(reader, consumer, 80, s -> s.length(), new HashSet<>(), true, true);
        assertEquals("hello world", writer.toString());
    }

}