package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.function.Function;

@RunWith(org.junit4.JUnit4.class)
public class GeneratedTest {

    @Mock
    private BufferedReader reader;

    @Mock
    private File file;

    @Mock
    private Charset charset;

    @Mock
    private Function<? super CharSequence, Number> stringWidth;

    public static class LineConsumer {
        public void accept(CharSequence s) throws IOException {
        }
    }

    public static class Builder {
        // implementation...
    }

    @Test
    public void fromReader() throws IOException {
        when(reader.readLine()).thenReturn("hello");
        WordWrap.Builder builder = WordWrap.from(reader);
        assertEquals(1, builder.length());
    }

    @Test
    public void fromClasspathUtf8() {
        when(file.exists()).thenReturn(true);
        when(file.canRead()).thenReturn(true);
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(file);
        assertEquals("utf-8", builder.charset().toString());
    }

    @Test
    public void wordWrapReaderLineConsumer() throws IOException {
        when(reader.readLine()).thenReturn("hello\nworld");
        WordWrap.wordWrap(reader, new LineConsumer(), 20, stringWidth, new HashSet<>(), false, true);
        verify(new LineConsumer()).accept(any());
    }

    @Test
    public void wordWrapFile() throws IOException {
        when(file.length()).thenReturn(10);
        WordWrap.wordWrap(file, charset, 20, stringWidth, new HashSet<>(), false, true);
        // implementation depends on file length
    }

    @Test
    public void isWhitespace() {
        assertFalse(isWhitespace("hello"));
        assertFalse(isWhitespace("\t"));
        assertTrue(isWhitespace("\n"));
    }

    @Test
    public void rightTrim() {
        when(stringWidth.apply(CharSequence.of("hello\n"))).thenReturn(5);
        assertEquals("hello", WordWrap.rightTrim(CharSequence.of("hello\n")));
    }

    @Test
    public void leftTrim() throws IOException {
        System.setIn(new FileInputStream("resource"));
        StringBuilder builder = new StringBuilder(reader.readLine());
        WordWrap.leftTrim(builder);
        assertEquals("", builder.toString().trim());
    }

    private boolean isWhitespace(String s) {
        return s.matches("^[\\s\\t]*$");
    }

}