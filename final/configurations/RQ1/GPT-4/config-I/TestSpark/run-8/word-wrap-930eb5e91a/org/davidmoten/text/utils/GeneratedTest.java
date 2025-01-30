package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void fromUtf8Test() {
        InputStream mockInputStream = mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(mockInputStream);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileAndCharsetTest() throws FileNotFoundException {
        File file = mock(File.class);
        FileInputStream fileInputStream = mock(FileInputStream.class);
        when(new FileInputStream(file)).thenReturn(fileInputStream);
        WordWrap.Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileAndCharsetFileNotFoundExceptionTest() throws FileNotFoundException {
        File file = mock(File.class);
        FileInputStream fileInputStream = mock(FileInputStream.class);
        when(new FileInputStream(file)).thenThrow(FileNotFoundException.class);
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void fromInputStreamAndCharsetTest() {
        InputStream inputStream = mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.from(inputStream, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromTextTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromReaderAndCloseTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader, false);
        Assert.assertNotNull(builder);
    }

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        WordWrap.Builder resultBuilder = builder.insertHyphens(true);
        Assert.assertEquals(builder, resultBuilder);
    }

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        WordWrap.Builder resultBuilder = builder.breakWords(true);
        Assert.assertEquals(builder, resultBuilder);
    }

    @Test
    public void wrapWriterTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        StringWriter writer = new StringWriter();
        builder.wrap(writer);
        writer.flush();
        Assert.assertEquals("test", writer.toString());
    }

}