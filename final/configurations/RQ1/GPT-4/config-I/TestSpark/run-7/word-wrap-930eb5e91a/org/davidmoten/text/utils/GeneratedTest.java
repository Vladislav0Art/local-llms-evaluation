package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

public class GeneratedTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Some input string");
        Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() throws UnsupportedEncodingException {
        Builder builder = WordWrap.fromClasspathUtf8("sample.txt");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() throws UnsupportedEncodingException {
        Builder builder = WordWrap.fromClasspath("sample.txt", StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from("Some input string");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromUtf8Test() throws UnsupportedEncodingException {
        InputStream in = new ByteArrayInputStream("Some input string".getBytes(StandardCharsets.UTF_8));
        Builder builder = WordWrap.fromUtf8(in);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromInputStreamCharsetTest() throws UnsupportedEncodingException {
        InputStream in = new ByteArrayInputStream("Some input string".getBytes(StandardCharsets.UTF_8));
        Builder builder = WordWrap.from(in, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileCharsetTest() {
        File file = new File("sample.txt");
        expectedEx.expect(RuntimeException.class);
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void maxWidthTest() {
        Builder builder = WordWrap.from("Some input string").maxWidth(80);
        Assert.assertNotNull(builder);
    }

    @Test
    public void stringWidthTest() {
        Builder builder = WordWrap.from("Some input string").stringWidth(CharSequence::length);
        Assert.assertNotNull(builder);
    }

    @Test
    public void newLineTest() {
        Builder builder = WordWrap.from("Some input string").newLine("\n");
        Assert.assertNotNull(builder);
    }

    @Test
    public void extraWordCharsTest() {
        Set<Character> chars = Collections.singleton('a');
        Builder builder = WordWrap.from("Some input string").extraWordChars(chars);
        Assert.assertNotNull(builder);
    }

    @Test
    public void includeExtraWordCharsTest() {
        Builder builder = WordWrap.from("Some input string").includeExtraWordChars("abc");
        Assert.assertNotNull(builder);
    }

    @Test
    public void excludeExtraWordCharsTest() {
        Builder builder = WordWrap.from("Some input string").excludeExtraWordChars("abc");
        Assert.assertNotNull(builder);
    }

    @Test
    public void insertHyphensTest() {
        Builder builder = WordWrap.from("Some input string").insertHyphens(true);
        Assert.assertNotNull(builder);
    }

    @Test
    public void breakWordsTest() {
        Builder builder = WordWrap.from("Some input string").breakWords(true);
        Assert.assertNotNull(builder);
    }

    @Test
    public void wrapWriterTest() {
        StringReader reader = new StringReader("Some input string");
        StringWriter writer = new StringWriter();
        WordWrap.from(reader).wrap(writer);
    }

    @Test
    public void wrapWriterTest_IOException() {
        StringReader reader = new StringReader("Some input string");
        Writer writer = new Writer() {
            @Override
            public void close() throws IOException {
                throw new IOException();
            }

            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
            }

            public void flush() throws IOException {
            }
        };
        expectedEx.expect(RuntimeException.class);
        WordWrap.from(reader).wrap(writer);
    }

    @Test
    public void wrapTest() {
        StringReader reader = new StringReader("Some input string");
        String wrapStr = WordWrap.from(reader).wrap();
        Assert.assertEquals(wrapStr, "Some input string");
    }

}