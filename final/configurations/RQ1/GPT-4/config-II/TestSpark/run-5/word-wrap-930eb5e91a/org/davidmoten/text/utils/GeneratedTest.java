package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        String input = "Hello world this is a test of WordWrap from reader.";
        StringReader reader = new StringReader(input);
        Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "resource.txt";
        Builder builder = WordWrap.fromClasspathUtf8(resource);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "Hello world this is a test of WordWrap from char sequence.";
        Builder builder = WordWrap.from(text);
        Assert.assertNotNull(builder);
    }

    @Test
    public void maxWidthTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        builder.maxWidth(50);
        Assert.assertEquals(50, builder.maxWidth.doubleValue(), 0);
    }

    @Test
    public void stringWidthTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        Map<Character, Integer> charWidths = new HashMap<>();
        charWidths.put('T', 2);
        charWidths.put('e', 1);
        charWidths.put('s', 1);
        charWidths.put('t', 1);
        Function<CharSequence, Number> stringWidthFunction = sequence -> {
            int width = 0;
            for (char c : sequence.toString().toCharArray()) {
                if (charWidths.containsKey(c)) {
                    width += charWidths.get(c);
                }
            }
            return width;
        };
        builder.stringWidth(stringWidthFunction);
        Assert.assertEquals(stringWidthFunction, builder.stringWidth);
    }

    @Test
    public void newLineTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        builder.newLine("\r\n");
        Assert.assertEquals("\r\n", builder.newLine);
    }

    @Test
    public void extraWordCharsSetTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        Set<Character> wordChars = WordWrap.toSet("aeiou");
        builder.extraWordChars(wordChars);
        Assert.assertEquals(wordChars, builder.extraWordChars);
    }

    @Test
    public void extraWordCharsStringTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        String wordChars = "aeiou";
        builder.extraWordChars(wordChars);
        Assert.assertEquals(wordChars, builder.extraWordChars);
    }

    @Test
    public void includeExtraWordCharsTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        String includeWordChars = "xyz";
        builder.includeExtraWordChars(includeWordChars);
        Set<Character> expectedChars = WordWrap.toSet(WordWrap.SPECIAL_WORD_CHARS + includeWordChars);
        Assert.assertEquals(expectedChars, builder.extraWordChars);
    }

    @Test
    public void excludeExtraWordCharsTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        String excludeWordChars = "!.;";
        builder.excludeExtraWordChars(excludeWordChars);
        Set<Character> expectedChars = WordWrap.toSet(WordWrap.SPECIAL_WORD_CHARS.replace("!.;", ""));
        Assert.assertEquals(expectedChars, builder.extraWordChars);
    }

    @Test
    public void insertHyphensTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        builder.insertHyphens(true);
        Assert.assertTrue(builder.insertHyphens);
    }

    @Test
    public void breakWordsTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        builder.breakWords(true);
        Assert.assertTrue(builder.breakWords);
    }

    @Test
    public void wrapWriterTest() {
        String input = "Hello world this is a test of WordWrap wrap with writer.";
        StringReader reader = new StringReader(input);
        StringWriter writer = new StringWriter();
        WordWrap.from(reader).wrap(writer);
        String output = writer.toString();
        Assert.assertTrue(output.contains("\n"));
    }

    @Test
    public void wrapTest() {
        String input = "Hello world this is a test of WordWrap wrap.";
        String output = WordWrap.from(input).wrap();
        Assert.assertTrue(output.contains("\n"));
    }

    @Test
    public void fromClasspathTest() {
        String resource = "resource.txt";
        Builder builder = WordWrap.fromClasspath(resource, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void wrapToListTest() {
        String input = "Hello world this is a test of WordWrap overall functionality.";
        Builder builder = WordWrap.from(input);
        builder.maxWidth(20);
        List<String> wrappedLines = builder.wrapToList();
        Assert.assertTrue(wrappedLines.get(0).length() <= 20);
    }

    @Test
    public void fromUtf8Test() {
        InputStream inputStream = new ByteArrayInputStream("Test".getBytes(StandardCharsets.UTF_8));
        Builder builder = WordWrap.fromUtf8(inputStream);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream inputStream = new ByteArrayInputStream("Test".getBytes(StandardCharsets.UTF_8));
        Builder builder = WordWrap.from(inputStream, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileCharsetTest() {
        File file = new File("test.txt");
        Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}