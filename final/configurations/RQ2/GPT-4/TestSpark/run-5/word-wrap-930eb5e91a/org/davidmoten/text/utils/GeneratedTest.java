package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        String text = "Hello, World!";
        Reader reader = new StringReader(text);
        Assert.assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "resource.txt";
        Assert.assertNotNull(WordWrap.fromClasspathUtf8(resource));
    }

    @Test
    public void fromClasspathTest() {
        String resource = "resource.txt";
        Assert.assertNotNull(WordWrap.fromClasspath(resource, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        String text = "Hello, World!";
        Assert.assertNotNull(WordWrap.from(text));
    }

    @Test
    public void fromUtf8Test() {
        byte[] data = "Hello, World!".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        Assert.assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        byte[] data = "Hello, World!".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        InputStream in = new ByteArrayInputStream(data);
        Assert.assertNotNull(WordWrap.from(in, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharsetTest() throws FileNotFoundException {
        File file = new File("test.txt");
        PrintWriter out = new PrintWriter("test.txt");
        out.println("Hello, World!");
        out.close();
        Assert.assertNotNull(WordWrap.from(file, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void fromReaderCloseTest() {
        String text = "Hello, World!";
        Reader reader = new StringReader(text);
        Assert.assertNotNull(WordWrap.from(reader, true));
    }

    @Test
    public void rightTrimTest() {
        String text = "Hello, World!  ";
        Assert.assertEquals("Hello, World!", WordWrap.rightTrim(text).toString());
    }

    @Test
    public void isWhitespaceTest() {
        String text = "  ";
        Assert.assertTrue(WordWrap.isWhitespace(text));
    }

    @Test
    public void isNotWhitespaceTest() {
        String text = "Hello, World!";
        Assert.assertFalse(WordWrap.isWhitespace(text));
    }

}