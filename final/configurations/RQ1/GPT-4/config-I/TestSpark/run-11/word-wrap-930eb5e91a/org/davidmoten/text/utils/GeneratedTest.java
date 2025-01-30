package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void fromReaderWrapTest() throws IOException {
        Reader input = new StringReader("This is a test for word wrap function.");

        String wrappedText = WordWrap.from(input)
                .maxWidth(10)
                .wrap();

        assertEquals("This is a\ntest for word\nwrap\nfunction.", wrappedText);
    }

    @Test
    public void fromCharSequenceWrapTest() {
        CharSequence text = "This is another test for word wrap function.";

        String wrappedText = WordWrap.from(text)
                .maxWidth(15)
                .wrap();

        assertEquals("This is\nanother test\nfor word wrap\nfunction.", wrappedText);
    }

    @Test
    public void fromUtf8StreamWrapTest() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("This is a UTF-8 wrap test.".getBytes());

        String wrappedText = WordWrap.from(inputStream, StandardCharsets.UTF_8)
                .maxWidth(5)
                .wrap();

        assertEquals("This\nis a\nUTF-8\nwrap\ntest.", wrappedText);
    }

    @Test
    public void fromClasspathWrapTest() {
        String classpathResource = "/file.txt";

        String wrappedText = WordWrap.fromClasspath(classpathResource, StandardCharsets.UTF_8)
                .maxWidth(10)
                .wrap();

        assertEquals("Expected text after wrapping", wrappedText);
    }

    @Test
    public void maxWidthAndNewlineWrapTest() {
        Reader input = new StringReader("This is a test for max width and new line.");

        String wrappedText = WordWrap.from(input)
                .maxWidth(20)
                .newLine("\r\n")
                .wrap();

        assertEquals("This is a test for\r\nmax width and new\r\nline.", wrappedText);
    }

    @Test
    public void insertHyphensWrapTest() {
        Reader input = new StringReader("This is a test for inserting hyphens.");

        String wrappedText = WordWrap.from(input)
                .maxWidth(10)
                .insertHyphens(true)
                .wrap();

        assertEquals("This is a\ntest for-\ninserting\nhyphens.", wrappedText);
    }

    @Test
    public void breakWordsWrapTest() {
        Reader input = new StringReader("This is a test for breaking words.");

        String wrappedText = WordWrap.from(input)
                .maxWidth(10)
                .breakWords(true)
                .wrap();

        assertEquals("This is a\ntest for\nbreaking\nwords.", wrappedText);
    }

}