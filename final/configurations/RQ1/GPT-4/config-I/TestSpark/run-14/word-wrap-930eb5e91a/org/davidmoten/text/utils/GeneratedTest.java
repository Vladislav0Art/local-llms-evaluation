package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedTest {

    @Test
    public void maxWidthInvalidInputTest() {
        WordWrap.from("This is a normal text").maxWidth(-1).wrap();
    }

    @Test
    public void stringWidthTest() {
        Function<? super CharSequence, ? extends Number> stringWidth = s -> s.toString().toUpperCase().length();
        List<String> wordWrapLines = WordWrap.from("This is a normal text").stringWidth(stringWidth).wrapToList();
        Assert.assertFalse(wordWrapLines.isEmpty());
    }

    @Test
    public void newLineTest() {
        String newLine = "\r";
        String wrappedText = WordWrap.from("This is a normal text").newLine(newLine).wrap();
        Assert.assertTrue(wrappedText.contains(newLine));
    }

    @Test
    public void insertHyphensTest() {
        boolean insertHyphens = false;
        String wrappedText = WordWrap.from("This is a normal text").insertHyphens(insertHyphens).wrap();
        Assert.assertFalse(wrappedText.contains("-"));
    }

    @Test
    public void breakWordsTest() {
        boolean breakWords = false;
        String wrappedText = WordWrap.from("This is a normal text").breakWords(breakWords).wrap();
        Assert.assertFalse(wrappedText.contains("\n"));
    }

    @Test
    public void wrapTestException() throws IOException {
        Writer writer = Mockito.mock(Writer.class);
        Mockito.doThrow(new IOException()).when(writer).write(Mockito.anyString(), Mockito.anyInt(), Mockito.anyInt());
        WordWrap.from("This is a normal text").wrap(writer);
    }

    @Test
    public void fromUtf8Test() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("This is a normal text".getBytes(StandardCharsets.UTF_8));
        String wrappedText = WordWrap.fromUtf8(byteArrayInputStream).wrap();
        Assert.assertFalse(wrappedText.isEmpty());
    }

    @Test
    public void fromFileWithCharsetTestException() {
        File nonExistentFile = Mockito.mock(File.class);
        Mockito.when(nonExistentFile.exists()).thenReturn(false);
        WordWrap.from(nonExistentFile, StandardCharsets.UTF_8);
    }

    @Test
    public void wrapTestExceptionWithCharset() {
        WordWrap.Builder builder = WordWrap.from("This is a normal text");
        File mockFile = Mockito.mock(File.class);
        Mockito.when(mockFile.exists()).thenReturn(true);
        Mockito.when(mockFile.canWrite()).thenReturn(true);
        builder.wrap(mockFile, StandardCharsets.UTF_8);
    }

}