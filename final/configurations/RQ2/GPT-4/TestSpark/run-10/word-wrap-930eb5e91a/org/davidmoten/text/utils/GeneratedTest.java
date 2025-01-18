package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.davidmoten.text.utils.WordWrap;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder builder = WordWrap.from("Test text");
        assertNotNull(builder);
    }

    @Test
    public void fromReaderTest() throws IOException {
        File file = tempFolder.newFile("testFile.txt");
        PrintWriter out = new PrintWriter(file);
        out.println("Testing Reader Input");
        out.close();

        Reader reader = new FileReader(file);
        WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("/test-resource.txt");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathWithCharsetTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("/test-resource.txt", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromUtf8Test() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/test-resource.txt");
        WordWrap.Builder builder = WordWrap.fromUtf8(fileInputStream);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamWithCharsetTest() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/test-resource.txt");
        WordWrap.Builder builder = WordWrap.from(fileInputStream, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void fromFileWithCharsetTest() throws IOException {
        File file = tempFolder.newFile("testFile.txt");
        WordWrap.Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim("test   ");
        assertEquals("test", result.toString());
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("   "));
        assertFalse(WordWrap.isWhitespace("test   "));
    }

}