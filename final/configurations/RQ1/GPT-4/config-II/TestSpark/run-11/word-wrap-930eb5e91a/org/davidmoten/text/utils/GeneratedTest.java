package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        WordWrap.Builder builder = WordWrap.from(new StringReader("abc"));
        builder.extraWordChars(set);
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("/test.txt");
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void fromClasspathCharsetTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("/test.txt", Charset.forName("UTF-8"));
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder builder = WordWrap.from("abc");
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void fromInputStreamUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromUtf8(new ByteArrayInputStream("abc".getBytes()));
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void fromInputStreamCharsetTest() {
        WordWrap.Builder builder = WordWrap.from(new ByteArrayInputStream("abc".getBytes()), Charset.forName("UTF-8"));
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void fromFileAndCharsetTest() throws Exception {
        File file = new File(getClass().getResource("/test.txt").getFile());
        WordWrap.Builder builder = WordWrap.from(file, Charset.forName("UTF-8"));
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void builderMaxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("abc");
        builder.maxWidth(100);
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void builderStringWidthTest() {
        WordWrap.Builder builder = WordWrap.from("abc");
        builder.stringWidth(CharSequence::length);
        assertEquals("abc", builder.wrap());
    }

    @Test
    public void builderNewLineTest() {
        WordWrap.Builder builder = WordWrap.from("abc\ndef");
        builder.newLine("\n");
        assertEquals("abc\ndef", builder.wrap());
    }

    @Test
    public void builderExtraWordCharsSetTest() {
        WordWrap.Builder builder = WordWrap.from("abc def");
        Set<Character> set = new HashSet<>();
        set.add(' ');
        builder.extraWordChars(set);
        assertEquals("abc def", builder.wrap());
    }

    @Test
    public void builderExtraWordCharsStringTest() {
        WordWrap.Builder builder = WordWrap.from("abc-def");
        builder.extraWordChars("-");
        assertEquals("abc-def", builder.wrap());
    }

    @Test
    public void builderIncludeExtraWordCharsTest() {
        WordWrap.Builder builder = WordWrap.from("abc-def");
        builder.extraWordChars("-").includeExtraWordChars("-");
        assertEquals("abc-def", builder.wrap());
    }

    @Test
    public void builderExcludeExtraWordCharsTest() {
        WordWrap.Builder builder = WordWrap.from("abc-def");
        builder.extraWordChars("-").excludeExtraWordChars("-");
        assertEquals("abcdef", builder.wrap());
    }

    @Test
    public void builderNoInsertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("abcdef");
        builder.insertHyphens(false);
        assertEquals("abcdef", builder.wrap());
    }

    @Test
    public void builderNoBreakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("abcdef");
        builder.breakWords(false);
        assertEquals("abcdef", builder.wrap());
    }

    @Test
    public void builderWrapToStringTest() {
        WordWrap.Builder builder = WordWrap.from("abcdef");
        String result = builder.wrap();
        assertEquals("abcdef", result);
    }

    @Test
    public void builderWrapToListTest() {
        WordWrap.Builder builder = WordWrap.from("abc\ndef");
        List<String> result = builder.wrapToList();
        assertEquals("abc\ndef", result.toString());
    }

    @Test
    public void toSetTest() {
        Set<Character> result = WordWrap.toSet("abcdef");
        assertTrue(result.contains('a'));
        assertTrue(result.contains('b'));
        assertTrue(result.contains('c'));
        assertTrue(result.contains('d'));
        assertTrue(result.contains('e'));
        assertTrue(result.contains('f'));
    }

}