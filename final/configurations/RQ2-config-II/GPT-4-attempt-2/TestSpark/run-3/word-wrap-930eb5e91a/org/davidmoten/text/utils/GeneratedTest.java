package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.HashSet;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("test");
        Assert.assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        Assert.assertNotNull(WordWrap.fromClasspathUtf8("test-resource"));
    }

    @Test
    public void fromClasspathTest() {
        Assert.assertNotNull(WordWrap.fromClasspath("test-resource", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        Assert.assertNotNull(WordWrap.from("test"));
    }

    @Test
    public void fromUtf8InputStreamTest() {
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        Assert.assertNotNull(WordWrap.fromUtf8(inputStream));
    }

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        Assert.assertNotNull(WordWrap.from(inputStream, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("prefix", "suffix");
        Assert.assertNotNull(WordWrap.from(tempFile, StandardCharsets.UTF_8));
    }

    @Test
    public void rightTrimTest() throws Exception {
        String result = WordWrap.rightTrim(" test ").toString();
        Assert.assertEquals(result, " test");
    }

    @Test
    public void isWhitespaceTest() {
        Assert.assertTrue(WordWrap.isWhitespace(" "));
        Assert.assertFalse(WordWrap.isWhitespace("test"));
    }

    @Test
    public void closeTest() throws Exception {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.close(reader);
        Mockito.verify(reader).close();
    }

}