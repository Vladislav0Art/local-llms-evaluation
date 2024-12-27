package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("Testing method")));
    }

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("Testing from(CharSequence text) method"));
    }

    @Test
    public void fromUtf8Test() {
        String input = "Test Input";
        assertNotNull(WordWrap.fromUtf8(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8))));
    }

    @Test
    public void fromNullUtf8Test() {
        WordWrap.fromUtf8(null);
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace(" A"));
    }

    @Test
    public void rightTrimTest() {
        CharSequence trimmed = WordWrap.rightTrim("   Test  ");
        assertEquals("   Test", trimmed);
    }

    @Test
    public void wordWrapReadWriterTest() throws IOException {
        StringWriter out = new StringWriter();
        WordWrap.wordWrap(new StringReader("Testing wordWrap(Reader, Writer...) method"), out, "\n", 80, null, null, false, false);
        assertEquals("Testing wordWrap(Reader, Writer...) method", out.toString());
    }

}