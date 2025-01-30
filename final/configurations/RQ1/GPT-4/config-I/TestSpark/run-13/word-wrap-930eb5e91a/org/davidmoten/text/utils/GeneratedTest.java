package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        BufferedReader reader = new BufferedReader(new StringReader("hello world"));
        WordWrap.Builder builder = WordWrap.from(reader);
        assertEquals("hello\nworld", builder.wrap());
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("test.txt");
        assertTrue(builder instanceof WordWrap.Builder);
    }

    @Test
    public void fromClasspathCharsetTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8);
        assertTrue(builder instanceof WordWrap.Builder);
    }

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        WordWrap.Builder builder =
                WordWrap.from(getClass().getResourceAsStream("test.txt"), StandardCharsets.UTF_8);
        assertTrue(builder instanceof WordWrap.Builder);
    }

    @Test
    public void maxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("Long sentence that will be wrapped into two lines.");
        builder.maxWidth(20);
        assertEquals("Long sentence that\nwill be wrapped\ninto two lines.", builder.wrap());
    }

    @Test
    public void newLineTest() {
        WordWrap.Builder builder = WordWrap.from("hello world");
        builder.newLine("NEWLINE");
        assertTrue(builder.wrap().contains("NEWLINE"));
    }

    @Test
    public void extraWordCharsTest() {
        Set<Character> extraWordChars = Set.of('?', '.');
        WordWrap.Builder builder = WordWrap.from("hello world?");
        builder.extraWordChars(extraWordChars);
        assertEquals("hello horld?\n", builder.wrap());
    }

    @Test
    public void excludeExtraWordCharsTest() {
        Set<Character> extraWordChars = Set.of('?');
        WordWrap.Builder builder = WordWrap.from("hello world");
        builder.extraWordChars(extraWordChars);
        builder.excludeExtraWordChars("?");
        assertEquals("hello\nworld", builder.wrap());
    }

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("Long sentence that will be wrapped into two lines.");
        builder.insertHyphens(true);
        assertTrue(builder.wrap().contains("-"));
    }

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("Long sentence that will be wrapped into two lines.");
        builder.breakWords(true);
        assertTrue(builder.wrap().contains(" "));
    }

    @Test
    public void wordWrapAllTest() {
        WordWrap.Builder builder = WordWrap.from("Long sentence that will be wrapped into two lines.");
        builder.insertHyphens(true);
        builder.breakWords(true);
        builder.maxWidth(20);
        assertEquals("Long sentence\nthat will be\nwrapped into\ntwo lines.", builder.wrap());
    }

}