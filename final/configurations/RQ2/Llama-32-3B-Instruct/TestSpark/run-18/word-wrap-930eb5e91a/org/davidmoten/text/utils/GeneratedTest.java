package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void fromReader_emptyReturnsEmptyBuilder() {
        // given
        WordWrap.Builder builder = WordWrap.from(new StringReader(""));

        // then
        assertNotNull(builder);
        assertTrue(builder.isEmpty());
    }

    @Test
    public void fromReader_singleWordReturnSingleWordBuilder() {
        // given
        WordWrap.Builder builder = WordWrap.from(new StringReader("hello"));

        // when
        boolean hasMoreWords = builder.hasMoreWords();

        // then
        assertTrue(hasMoreWords);
    }

    @Test
    public void fromClasspathUtf8_singleResourceReturnSingleWordBuilder() {
        // given
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("hello");

        // when
        boolean hasMoreWords = builder.hasMoreWords();

        // then
        assertTrue(hasMoreWords);
    }

    @Test
    public void fromFile_utf8_returnsCorrectMaxWidth() throws IOException {
        // given
        File file = new File("test.txt");
        WordWrap.Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);

        // when
        Number maxWidth = builder.getMaxWidth();

        // then
        assertNotNull(maxWidth);
    }

    @Test
    public void fromClasspath_utf8_insertHyphens_insertsCorrectly() throws IOException {
        // given
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("test.txt");
        boolean insertHyphens = true;

        // when
        List<String> words = builder.getWords();

        // then
        assertTrue(words.contains("hello-world"));
    }

    @Test
    public void wordWrap_insertsCorrectLines() throws IOException {
        // given
        String text = "Hello World";
        WordWrap.Builder builder = WordWrap.from(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);

        // when
        WordWrap.wordWrap(builder.build().getReader(), writer, "\n", 10,
                (s) -> s.length(),
                Set.of(' '),
                true,
                false);

        // then
        String expected = "Hello\nWorld";
        assertEquals(expected, out.toString());
    }

    @Test
    public void wordWrap_insertsCorrectLinesBreakWords() throws IOException {
        // given
        String text = "Hello World, this is a test.";
        WordWrap.Builder builder = WordWrap.from(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);

        // when
        WordWrap.wordWrap(builder.build().getReader(), writer, "\n", 10,
                (s) -> s.length(),
                Set.of(' '),
                true,
                true);

        // then
        String expected = "Hello\nWorld,\nthis is a test.";
        assertEquals(expected, out.toString());
    }

    @Test
    public void rightTrim_trimsCorrectly() {
        // given
        CharSequence text = new StringBuilder("   hello world  ");

        // when
        CharSequence trimmedText = WordWrap.rightTrim(text);

        // then
        assertTrue(trimmedText.equals(new StringBuilder("hello world")));
    }

    @Test
    public void isWhitespace_returnTrueIfEmptyOrWhiteSpaces() {
        // given
        CharSequence text = new StringBuilder("");
        CharSequence nonWhiteSpaces = new StringBuilder("Hello World");

        // when
        boolean result1 = WordWrap.isWhitespace(text);
        boolean result2 = WordWrap.isWhitespace(nonWhiteSpaces);

        // then
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    public void leftTrim_trimsCorrectly() {
        // given
        StringBuilder word = new StringBuilder("   hello world  ");

        // when
        WordWrap.leftTrim(word);

        // then
        assertEquals(new StringBuilder("hello world"), word);
    }

}