package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void fromReader() {
        Preconditions.checkState(new WordWrap.Builder().from(new BufferedReader(new FileReader("test.txt"))).isComplete(), "Builder is not complete");
    }

    @Test
    public void fromUtf8InputStream() {
        Preconditions.checkState(new WordWrap.Builder().fromUtf8(new FileInputStream("test.txt")).isComplete(), "Builder is not complete");
    }

    @Test
    public void fromFile() {
        Preconditions.checkState(new WordWrap.Builder().from(new File("test.txt"), StandardCharsets.UTF_8).isComplete(), "Builder is not complete");
    }

    @Test
    public void wordWrapReaderWriter() throws IOException {
        String text = "This is a long text that needs to be wrapped.";
        String[] lines = text.split("\n");

        Preconditions.checkState(lines.length > 0, "Text must contain at least one line.");
        Preconditions.checkState(new WordWrap.Builder().from(text).wordWrap(new FileWriter("output.txt"), null, "\n", null, x -> x.toLong(), new HashSet<>(), false, true).isComplete(), "Builder is not complete");

        File outputFile = new File("output.txt");
        assertTrue(outputFile.exists());
    }

    @Test
    public void wordWrapReaderLineConsumer() throws IOException {
        String text = "This is a long text that needs to be wrapped.";
        String[] lines = text.split("\n");

        Preconditions.checkState(lines.length > 0, "Text must contain at least one line.");
        Preconditions.checkState(new WordWrap.Builder().from(text).wordWrap(new BufferedReader(new FileReader("test.txt")), writer -> writer.append("line\n"), null, x -> x.toLong(), new HashSet<>(), false, true).isComplete(), "Builder is not complete");

        File outputFile = new File("output.txt");
        assertTrue(outputFile.exists());
    }

    @Test
    public void fromReaderClose() {
        Preconditions.checkState(new WordWrap.Builder().from(new BufferedReader(new FileReader("test.txt"))).close(), "Method must be called at least once.");
    }

    @Test
    public void rightTrim() {
        String trimmed = new WordWrap().rightTrim("   ");
        assertTrue(trimmed.equals(""));
    }

    @Test
    public void isWhitespace() {
        assertTrue(new WordWrap().isWhitespace(" "));
        assertFalse(new WordWrap().isWhitespace("\n"));
    }

    @Test
    public void leftTrimStringBuilder2() {
        StringBuilder word = new StringBuilder();
        Preconditions.checkState(WordWrap.leftTrim(word), "Method must be called at least once.");
    }

}