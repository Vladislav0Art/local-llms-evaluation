package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void maxWidthZeroTest() {
        String input = "Hello world";
        WordWrap.from(new StringReader(input)).maxWidth(0).wrap();
    }

    @Test
    public void fromEmptyStringTest() {
        String input = "";
        String output = WordWrap.from(input).wrap();
        assertEquals("", output);
    }

    @Test
    public void fromClasspathUtf8Test() {
        String output = WordWrap.fromClasspathUtf8("/input.txt").wrap();
        assertTrue(output.length() > 0);
    }

    @Test
    public void replaceDefaultSpecialWordCharactersTest() {
        Set<Character> newExtraWordChars = new HashSet<>();
        newExtraWordChars.add('~');
        String input = "Hello+world";
        String output = WordWrap.from(input).extraWordChars(newExtraWordChars).wrap();
        assertEquals("Hello\n+world", output);
    }

    @Test
    public void fromSingleLineStringTest() {
        String input = "Hello world!";
        String output = WordWrap.from(input).wrap();
        assertEquals("Hello\nworld!", output);
    }

    @Test
    public void fromMultiLineStringTest() {
        String input = "Hello\nworld!";
        String output = WordWrap.from(input).wrap();
        assertEquals("Hello\nworld!", output);
    }

    @Test
    public void disableWordBreakAndInsertHyphensTest() {
        String input = "Hello world with a reallyreallyreallylongword!";
        String output = WordWrap.from(input).breakWords(false).insertHyphens(false).wrap();
        assertTrue(output.contains("reallyreallyreallylongword"));
    }

    @Test
    public void fromStreamTest() {
        InputStream in = new ByteArrayInputStream("Hello world!".getBytes());
        String output = WordWrap.from(in, Charset.defaultCharset()).wrap();
        assertEquals("Hello\nworld!", output);
    }

    @Test
    public void replaceNewLineTest() {
        String input = "Hello world!";
        String output = WordWrap.from(input).newLine("\r\n").wrap();
        assertTrue(output.contains("\r\n"));
    }

}