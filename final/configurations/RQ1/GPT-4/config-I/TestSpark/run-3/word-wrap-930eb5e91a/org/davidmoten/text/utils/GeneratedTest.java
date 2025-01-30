package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void fromReaderTest() throws IOException {
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        Builder builder = WordWrap.fromClasspathUtf8("resource");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathCharsetTest() {
        Builder builder = WordWrap.fromClasspath("resource", StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromTextTest() {
        Builder builder = WordWrap.from("Test");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream in = new ByteArrayInputStream("Test".getBytes());
        Builder builder = WordWrap.from(in, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("tempFile", ".txt");
        tempFile.deleteOnExit();
        try (BufferedWriter out = new BufferedWriter(new FileWriter(tempFile))) {
            out.write("Test");
        }
        Builder builder = WordWrap.from(tempFile, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileCharsetFileNotFoundTest() {
        File file = new File("non_existent_file");
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void wrapWriterTest() throws IOException {
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        Writer writer = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()));
        WordWrap.from(reader).wrap(writer);
    }

    @Test
    public void wrapWriterMaxWidthTest() throws IOException {
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        Writer writer = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream()));
        WordWrap.from(reader).maxWidth(2).wrap(writer);
    }

    @Test
    public void wrapFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("tempFile", ".txt");
        tempFile.deleteOnExit();
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        WordWrap.from(reader).wrap(tempFile, StandardCharsets.UTF_8);
    }

    @Test
    public void wrapFileCharsetIOExceptionTest() {
        File tempFile = new File("non_existent_file");
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("Test".getBytes())));
        WordWrap.from(reader).wrap(tempFile, StandardCharsets.UTF_8);
    }

    @Test
    public void wrapToStringTest() {
        String text = "Test string";
        String wrappedText = WordWrap.from(text).wrap();
        Assert.assertTrue(wrappedText.startsWith(text));
    }

}