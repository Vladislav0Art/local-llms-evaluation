package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        Builder builder = WordWrap.fromClasspathUtf8("/test.txt");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() {
        Builder builder = WordWrap.fromClasspath("/test.txt", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void builderMaxWidthTest() {
        Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.maxWidth(40);
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

    @Test
    public void insertHyphensTest() {
        Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.insertHyphens(true);
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

    @Test
    public void builderWrapListTest() {
        Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

    @Test
    public void builderWrapStringTest() throws IOException {
        Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.wrap("file.txt", StandardCharsets.UTF_8);
    }

    @Test
    public void builderWrapWriterTest() throws IOException {
        StringReader reader = new StringReader("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        StringWriter writer = new StringWriter();

        Builder builder = WordWrap.from(reader);
        builder.wrap(writer);
    }

    @Test
    public void builderWrapFileTest() throws IOException {
        Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.wrapUtf8("file.txt");
    }

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("/test.txt");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("/test.txt", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

    @Test
    public void builderMaxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.maxWidth(40);
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.insertHyphens(true);
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

    @Test
    public void builderWrapListTest() {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

    @Test
    public void builderWrapStringTest() throws IOException {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.wrap("file.txt", StandardCharsets.UTF_8);
    }

    @Test
    public void builderWrapWriterTest() throws IOException {
        StringReader reader = new StringReader("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        StringWriter writer = new StringWriter();
        WordWrap.Builder builder = WordWrap.from(reader);
        builder.wrap(writer);
    }

    @Test
    public void builderWrapFileTest() throws IOException {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.wrapUtf8("file.txt");
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("test.txt");
        assertNotNull(builder);
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}