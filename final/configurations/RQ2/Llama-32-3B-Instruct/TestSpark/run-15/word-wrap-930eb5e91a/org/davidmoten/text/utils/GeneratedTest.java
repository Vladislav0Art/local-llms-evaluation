package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedTest {

    @Test
    public void fromReader_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("Hello World"));
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("resource.txt");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspath_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspath("resource.txt", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void from_CharSequence_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new String("Hello World"));
        assertNotNull(builder);
    }

    @Test
    public void fromUtf8_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.fromUtf8(new ByteArrayInputStream(new byte[]{'H', 'e', 'l', 'l', 'o'}));
        assertNotNull(builder);
    }

    @Test
    public void fromInputStream_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new ByteArrayInputStream(new byte[]{'H', 'e', 'l', 'l', 'o'}), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromFile_ReturnsBuilder() throws IOException {
        WordWrap.Builder builder = WordWrap.from(new File("test.txt"), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void wordWrap_ReaderOut_DoesNotThrowIOException() throws IOException {
        WordWrap.wordWrap(null, null, "\n", 10L, String::length, new HashSet<>(), false, false);
    }

    @Test
    public void wordWrap_LineConsumerOut_DoesNotThrowIOException() throws IOException {
        WordWrap.wordWrap(null, null, "\n", 10L, String::length, new HashSet<>(), false, false);
    }

    @Test
    public void isWhitespace_HasWhitespaceCharacters() {
        assertTrue(WordWrap.isWhitespace("   "));
    }

    @Test
    public void isWhitespace_NoWhitespaceCharacters() {
        assertFalse(WordWrap.isWhitespace(""));
    }

    @Test
    public void rightTrim_TrimmedString() {
        assertEquals(" World", WordWrap.rightTrim("Hello World"));
    }

    @Test
    public void leftTrim_LeadingSpacesRemoved() {
        String expected = "Hello";
        WordWrap.leftTrim(new StringBuilder2(expected));
    }
}

class StringReader extends java.io.Reader {
    private final String string;

    public StringReader(String string) {
        this.string = string;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }
}

}