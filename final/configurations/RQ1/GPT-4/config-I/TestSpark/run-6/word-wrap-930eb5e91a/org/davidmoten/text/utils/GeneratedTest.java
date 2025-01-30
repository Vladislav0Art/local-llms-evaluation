package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void fromClasspathUtf8Test() throws IOException {
        File file = new File("src/test/resources/file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Builder builder = WordWrap.fromClasspathUtf8("src/test/resources/file.txt");

        String result = builder.wrap();

        assertEquals("", result);
    }

    @Test
    public void fromClasspathCharsetTest() throws IOException {
        File file = new File("src/test/resources/file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Builder builder = WordWrap.fromClasspath("src/test/resources/file.txt", StandardCharsets.UTF_8);

        String result = builder.wrap();

        assertEquals("", result);
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence charSequence = "abcdefghij";
        Builder builder = WordWrap.from(charSequence);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        File file = new File("src/test/resources/file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        Builder builder = WordWrap.from(fileReader);

        String result = builder.wrap();

        assertEquals("", result);
    }

    @Test
    public void fromFileCharsetTest() throws IOException {
        File file = new File("src/test/resources/file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);

        String result = builder.wrap();

        assertEquals("", result);
    }

    @Test
    public void maxWidthTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        builder.maxWidth(5);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void stringWidthTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        builder.stringWidth(s -> s.toString().getBytes().length);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void newLineTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        builder.newLine("\n\n");

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void extraWordCharsSetTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        Set<Character> extraWordChars = "abcdefghij".chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        builder.extraWordChars(extraWordChars);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void extraWordCharsStringTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        builder.extraWordChars("abcdefghij");

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void insertHyphensTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        builder.insertHyphens(true);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

    @Test
    public void breakWordsTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        builder.breakWords(true);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

}