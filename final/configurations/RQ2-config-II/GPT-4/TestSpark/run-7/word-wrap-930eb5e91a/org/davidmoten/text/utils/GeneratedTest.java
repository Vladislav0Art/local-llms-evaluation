package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        StringReader stringReader = new StringReader("Test string");
        WordWrap.Builder builder = WordWrap.from(stringReader);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("\\resources\\testResource");

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("\\resources\\testResource", StandardCharsets.UTF_8);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence charSequence = "Test string";
        WordWrap.Builder builder = WordWrap.from(charSequence);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromInputStreamTest() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    @Test
    public void fromReaderCloseTest() {
        StringReader stringReader = new StringReader("Test string");
        WordWrap.Builder builder = WordWrap.from(stringReader, true);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void closeReaderTest() {
        StringReader stringReader = new StringReader("Test string");
        WordWrap.close(stringReader);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        StringReader stringReader = new StringReader("Test string");
        StringWriter stringWriter = new StringWriter();
        Function<CharSequence, Number> stringWidth = CharSequence::length;
        Set<Character> extraWordChars = new HashSet<>();

        WordWrap.wordWrap(stringReader, stringWriter, "\n", 70, stringWidth, extraWordChars, false, false);

        assertEquals("Test string", stringWriter.toString());
    }

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        TestLineConsumer testLineConsumer = new TestLineConsumer();
        StringReader stringReader = new StringReader("Test string");
        Function<CharSequence, Number> stringWidth = CharSequence::length;
        Set<Character> extraWordChars = new HashSet<>();

        WordWrap.wordWrap(stringReader, testLineConsumer, 70, stringWidth, extraWordChars, false, false);

        assertEquals("Test string", testLineConsumer.getOutput());
    }

    @Test
    public void rightTrimTest() {
        CharSequence testString = "  Test string  ";
        CharSequence result = WordWrap.rightTrim(testString);

        assertEquals("  Test string", result.toString());
    }

    @Test
    public void isWhitespaceTest() {
        CharSequence testString = "  ";
        boolean result = WordWrap.isWhitespace(testString);

        assertEquals(true, result);
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2("  Test string");
        WordWrap.leftTrim(word);

        assertEquals("Test string", word.toString());
    }

    public class TestLineConsumer implements LineConsumer {
        private String output;

        @Override
        public void accept(CharSequence t) {
            output = t.toString();
        }

        public String getOutput() {
            return output;
        }
    }

}