package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.Writer;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.Builder builder = WordWrap.from(reader);
        assertEquals(builder.getReader(), reader);
    }

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "resource";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        assertEquals(builder.getResource(), resource);
    }

    @Test
    public void fromClasspathTest() {
        String resource = "resource";
        Charset charset = Charset.defaultCharset();
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        assertEquals(builder.getResource(), resource);
        assertEquals(builder.getCharset(), charset);
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "text";
        WordWrap.Builder builder = WordWrap.from(text);
        assertEquals(builder.getText(), text);
    }

    @Test
    public void fromUtf8Test() throws IOException {
        InputStream in = Mockito.mock(InputStream.class);
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertEquals(builder.getInputStream(), in);
    }

}