package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTest {

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.fromClasspathUtf8("SomeResource");
    }

    @Test
    public void fromClasspathUtf8NullTest() {
        WordWrap.fromClasspathUtf8(null);
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.fromClasspath("SomeResource", StandardCharsets.UTF_8);
    }

    @Test
    public void fromClasspathNullTest() {
        WordWrap.fromClasspath("SomeResource", null);
    }

    @Test
    public void fromInputStreamTest() {
        InputStream inputStream = Mockito.mock(InputStream.class);
        WordWrap.fromUtf8(inputStream);
    }

    @Test
    public void fromNullInputStreamTest() {
        WordWrap.fromUtf8(null);
    }

    @Test
    public void fromInputStreamAndCharsetTest() {
        InputStream inputStream = Mockito.mock(InputStream.class);
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.from(inputStream, charset);
    }

    @Test
    public void fromInputStreamAndNullCharsetTest() {
        InputStream inputStream = Mockito.mock(InputStream.class);
        WordWrap.from(inputStream, null);
    }

    @Test
    public void fromTextTest() {
        String text = "Hello, World!";
        WordWrap.from(text);
    }

    @Test
    public void fromNullTextTest() {
        String text = null;
        WordWrap.from(text);
    }

    @Test
    public void fromFileTest() throws FileNotFoundException {
        File file = Mockito.mock(File.class);
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void fromNullFileTest() throws FileNotFoundException {
        File file = null;
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void closeIOExceptionTest() throws IOException {
        Reader reader = Mockito.mock(Reader.class);
        Mockito.doThrow(new IOException()).when(reader).close();
        WordWrap.close(reader);
    }

    @Test
    public void rightTrimTest() {
        String original = "Some text    ";
        String trimmed = WordWrap.rightTrim(original).toString();
        Assert.assertEquals("Some text", trimmed);
    }

    @Test
    public void leftTrimTest() {
        WordWrap.StringBuilder2 word = new WordWrap.StringBuilder2("    Some text");
        WordWrap.leftTrim(word);
        Assert.assertEquals("Some text", word.toString());
    }

    @Test
    public void isWhitespaceTest() {
        boolean zeroLen = WordWrap.isWhitespace("");
        boolean space = WordWrap.isWhitespace("    ");
        boolean noSpace = WordWrap.isWhitespace("no space");
        Assert.assertTrue(zeroLen);
        Assert.assertTrue(space);
        Assert.assertFalse(noSpace);
    }

}