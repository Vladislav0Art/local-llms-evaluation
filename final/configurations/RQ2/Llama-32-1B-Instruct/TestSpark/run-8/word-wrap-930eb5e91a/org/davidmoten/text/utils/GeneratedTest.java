package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testWordWrap_FromReader() {
        Builder builder = new WordWrap.Builder();
        when(from(CharSequence.class, "hello world", StandardCharsets.UTF_8)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

    @Test
    public void testWordWrap_FromReaderWithClose() {
        Builder builder = new WordWrap.Builder();
        when(from(CharSequence.class, "hello world", StandardCharsets.UTF_8, true)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

    @Test
    public void testWordWrap_FromClasspathUtf8() {
        Builder builder = new WordWrap.Builder();
        when(fromClasspath(CharSequence.class, "resource.txt")).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

    @Test
    public void testWordWrap_FromClasspath() {
        Builder builder = new WordWrap.Builder();
        when(fromClasspath(CharSequence.class, "resource.txt", StandardCharsets.UTF_8)).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader("hello world", StandardCharsets.UTF_8));
        assertEquals("hello world", result.toString());
    }

    @Test
    public void testWordWrap_FromCharSequence() {
        Builder builder = new WordWrap.Builder();
        when(from(CharSequence.class, CharSequence.class)).thenReturn(builder);
        String result = builder.wordWrap(CharSequence.text);
        assertEquals(CharSequence.text, result.toString());
    }

    @Test
    public void testWordWrap_FromUtf8InputStream() {
        Builder builder = new WordWrap.Builder();
        when(fromUtf8(Readers.reader(new FileInputStream("resource.txt")))).thenReturn(builder);
        String result = builder.wordWrap(Readers.reader(new FileInputStream("resource.txt")));
        assertEquals("hello world", result.toString());
    }

    @Test
    public void testWordWrap_FromFile() {
        Builder builder = new WordWrap.Builder();
        when(fromFile("resource.txt")).thenReturn(builder);
        File file = new File("resource.txt");
        try (InputStream in = new FileInputStream(file)) {
            String result = builder.wordWrap(in, null, null, null, null, true, false);
            assertEquals("hello world", result.toString());
        }
    }

    @Test
    public void testWordWrap_FromReaderLineConsumer() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new InputStreamReader(System.in), "hello world")).thenReturn(builder));
        String result = builder.wordWrap("hello world");
        assertEquals("hello-world", result.toString());
    }

    @Test
    public void testWordWrap_FromReaderLineConsumerWithBreakWordsAndInsertHyphens() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new InputStreamReader(System.in), "hello world\n")).thenReturn(builder));
        String result = builder.wordWrap("hello-world\n");
        assertEquals("hello-world", result.toString());
    }

    @Test
    public void testWordWrap_FromReaderLineConsumerWithBreakWordsAndInsertHyphensAndClose() {
        Builder builder = new WordWrap.Builder();
        when(from(Readers.reader(new InputStreamReader(System.in), "hello world\n")).thenReturn(builder));
        String result = builder.wordWrap("hello-world\n");
        assertEquals("hello-world", result.toString());
    }

}