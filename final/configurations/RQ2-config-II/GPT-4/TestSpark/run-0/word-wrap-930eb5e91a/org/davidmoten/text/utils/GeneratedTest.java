package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Test");
        WordWrap.Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("resource");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathWithCharsetTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("resource", StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder builder = WordWrap.from("Test");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileWithCharsetTest() {
        WordWrap.Builder builder = WordWrap.from(new File("resource"), StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromWithCloseTest() {
        testReaderClose(true);
        testReaderClose(false);
    }

    private void testReaderClose(boolean close) {
        WordWrap.Builder result = WordWrap.from(new StringReader("Test"), close);
        Assert.assertNotNull(result);
    }

    @Test
    public void rightTrimTest() {
        String result = WordWrap.rightTrim("   Test   ").toString();
        Assert.assertEquals("Test   ", result);
    }

    @Test
    public void leftTrimTest() {
        StringBuilder word = new StringBuilder("   Test   ");
        WordWrap.leftTrim(word);
        Assert.assertEquals("Test   ", word.toString());
    }

    @Test
    public void isWhitespaceTest() {
        Assert.assertTrue(WordWrap.isWhitespace("   "));
        Assert.assertFalse(WordWrap.isWhitespace("Test"));
    }

    @Test
    public void wordWrapToWriterTest() throws IOException {
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(new StringReader("Test"), writer, "\n", 80, str -> 80, new HashSet<>(), false, false);
        Assert.assertEquals("Test", writer.toString().trim());
    }

    @Test
    public void wordWrapToLineConsumerTest() throws IOException {
        StringWriter writer = new StringWriter();
        WordWrap.wordWrap(new StringReader("Test"), line -> writer.write(line + "\n"), 80, str -> 80, new HashSet<>(), false, false);
        Assert.assertEquals("Test", writer.toString().trim());
    }

}