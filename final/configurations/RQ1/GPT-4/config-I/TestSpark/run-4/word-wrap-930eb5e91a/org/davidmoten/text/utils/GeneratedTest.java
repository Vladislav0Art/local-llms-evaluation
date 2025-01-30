package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.Reader;
import java.io.StringReader;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        Builder builder = WordWrap.fromClasspathUtf8("test");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathCharsetNullTest() {
        WordWrap.fromClasspath("test", null);
    }

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from("test");
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamUtf8Test() {
        InputStream is = new ByteArrayInputStream("test".getBytes());
        Builder builder = WordWrap.fromUtf8(is);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamCharsetNullTest() {
        InputStream is = new ByteArrayInputStream("test".getBytes());
        WordWrap.from(is, null);
    }

    @Test
    public void fromFileCharsetFileNotFoundTest() {
        File tempFile = new File("fakefile.txt");
        WordWrap.from(tempFile, StandardCharsets.UTF_8);
    }

    @Test
    public void maxWidthTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).maxWidth(100);
        assertNotNull(builder);
    }

    @Test
    public void maxWidthZeroTest() {
        Reader reader = new StringReader("test");
        WordWrap.from(reader).maxWidth(0);
    }

    @Test
    public void stringWidthTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).stringWidth(s -> s.length());
        assertNotNull(builder);
    }

    @Test
    public void extraWordCharsTest() {
        Reader reader = new StringReader("test");
        Set<Character> set = new HashSet<>();
        set.add('a');
        Builder builder = WordWrap.from(reader).extraWordChars(set);
        assertNotNull(builder);
    }

    @Test
    public void extraWordCharsStringTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).extraWordChars("test");
        assertNotNull(builder);
    }

    @Test
    public void includeExtraWordCharsTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).includeExtraWordChars("test");
        assertNotNull(builder);
    }

    @Test
    public void excludeExtraWordCharsTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).excludeExtraWordChars("test");
        assertNotNull(builder);
    }

    @Test
    public void insertHyphensTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).insertHyphens(true);
        assertNotNull(builder);
    }

    @Test
    public void breakWordsTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).breakWords(true);
        assertNotNull(builder);
    }

}