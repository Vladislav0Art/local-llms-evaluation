package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTest {

    @Test
    public void fromReaderTest() throws IOException {
        String resource = "resource";
        ByteArrayInputStream in = new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8));
        Reader reader = new InputStreamReader(in);
        boolean close = true;
        WordWrap.Builder builder = WordWrap.from(reader, close);
        Mockito.verify(builder).setText(resource);
    }

    @Test
    public void fromClasspathUtf8Test() throws IOException {
        String resource = "resource";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        Mockito.verify(builder).setText(resource);
    }

    @Test
    public void fromClasspathTest() throws IOException {
        String resource = "resource";
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        Mockito.verify(builder).setText(resource);
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "text";
        WordWrap.Builder builder = WordWrap.from(text);
        Mockito.verify(builder).setText(text.toString());
    }

    @Test
    public void fromUtf8InputStreamTest() throws IOException {
        String resource = "resource";
        ByteArrayInputStream in = new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8));
        Reader reader = new InputStreamReader(in);
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.fromUtf8(reader, charset);
        Mockito.verify(builder).setText(new String(Mockito.any(byte[].class), charset));
    }

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        String resource = "resource";
        ByteArrayInputStream in = new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8));
        Reader reader = new InputStreamReader(in);
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.from(reader, charset);
        Mockito.verify(builder).setText(new String(Mockito.any(byte[].class), charset));
    }

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        LineConsumer out = Mockito.mock(LineConsumer.class);
        Number maximumAmountOfCharactersPerLine = 10;
        Function<CharSequence, Number> stringWidth = (s) -> 5;
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        WordWrap.wordWrap(new InputStreamReader(new ByteArrayInputStream("text".getBytes(StandardCharsets.UTF_8))), out, maximumAmountOfCharactersPerLine.toString(), stringWidth, extraWordChars, insertHyphens, breakWords);
    }

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        LineConsumer out = Mockito.mock(LineConsumer.class);
        Number maximumAmountOfCharactersPerLine = 10;
        Function<CharSequence, Number> stringWidth = (s) -> 5;
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        WordWrap.wordWrap(new InputStreamReader(new ByteArrayInputStream("text".getBytes(StandardCharsets.UTF_8))), out, maximumAmountOfCharactersPerLine.toString(), stringWidth, extraWordChars, insertHyphens, breakWords);
    }

    @Test
    public void rightTrimCharSequenceTest() {
        CharSequence s = " text";
        CharSequence result = WordWrap.rightTrim(s);
        Mockito.verify(result).equals(" text");
    }

    @Test
    public void isWhitespaceCharSequenceTest() {
        CharSequence s = "";
        boolean result = WordWrap.isWhitespace(s);
        Mockito.verify(result, Mockito.times(1)).booleanValue();
    }

    @Test
    public void leftTrimStringBuilder2Test() {
        StringBuilder word = new StringBuilder("word ");
        WordWrap.leftTrim(word);
        Mockito.verify(word, Mockito.times(1)).append(' ');
    }

}