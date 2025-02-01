package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = Mockito.mock(Reader.class);
        assertEquals(WordWrap.Builder.class, WordWrap.from(reader).getClass());
    }

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "testResource";
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspathUtf8(resource).getClass());
    }

    @Test
    public void fromClasspathCharsetTest() {
        String resource = "testResource";
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspath(resource, StandardCharsets.UTF_8).getClass());
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "testText";
        assertEquals(WordWrap.Builder.class, WordWrap.from(text).getClass());
    }

    @Test
    public void fromUtf8InputStreamTest() throws IOException {
        InputStream in = mock(InputStream.class);
        assertEquals(WordWrap.Builder.class, WordWrap.fromUtf8(in).getClass());
    }

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        InputStream in = mock(InputStream.class);
        assertEquals(WordWrap.Builder.class, WordWrap.from(in, StandardCharsets.UTF_8).getClass());
    }

    @Test
    public void fromFileNotFoundTest() {
        File file = new File("nonExistingFile.txt");
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void closeReaderTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader);
        builder.wrap();
        verify(reader, times(1)).close();
    }

}