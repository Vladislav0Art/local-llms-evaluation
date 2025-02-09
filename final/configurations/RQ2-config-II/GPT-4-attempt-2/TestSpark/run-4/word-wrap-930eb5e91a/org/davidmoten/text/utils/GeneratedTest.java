package org.davidmoten.text.utils;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Assert;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

import java.nio.charset.Charset;
import java.io.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder result = WordWrap.from(reader);
        Assert.assertNotNull(result);
    }

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "/resource.txt";
        WordWrap.Builder result = WordWrap.fromClasspathUtf8(resource);
        Assert.assertNotNull(result);
    }

    @Test
    public void fromClasspathWithCharsetTest() {
        String resource = "/resource.txt";
        WordWrap.Builder result = WordWrap.fromClasspath(resource, Charset.defaultCharset());
        Assert.assertNotNull(result);
    }

    @Test
    public void fromSequenceTest() {
        WordWrap.Builder result = WordWrap.from("Test sequence");
        Assert.assertNotNull(result);
    }

    @Test
    public void fromUtf8InputStreamTest() throws FileNotFoundException {
        InputStream in = new FileInputStream("resource.txt");
        WordWrap.Builder result = WordWrap.fromUtf8(in);
        Assert.assertNotNull(result);
    }

    @Test
    public void fromInputStreamWithCharsetTest() throws FileNotFoundException {
        InputStream in = new FileInputStream("resource.txt");
        WordWrap.Builder result = WordWrap.from(in, Charset.defaultCharset());
        Assert.assertNotNull(result);
    }

    @Test
    public void fromFileWithCharsetTest() {
        File file = new File("resource.txt");
        WordWrap.Builder result = WordWrap.from(file, Charset.defaultCharset());
        Assert.assertNotNull(result);
    }

    @Test
    public void rightTrimTest() {
        CharSequence res = WordWrap.rightTrim("Test sequence ");
        Assert.assertEquals("Test sequence", res.toString());
    }

    @Test
    public void isWhitespaceTest() {
        boolean result = WordWrap.isWhitespace("    ");
        Assert.assertTrue(result);
        result = WordWrap.isWhitespace("notWhitespace");
        Assert.assertFalse(result);
    }

    @Test
    public void fromReaderWithCloseTest() {
        Reader reader = mock(Reader.class);
        WordWrap.Builder result = WordWrap.from(reader, true);
        Assert.assertNotNull(result);
    }

    @Test
    public void closeTest() throws IOException {
        Reader reader = mock(Reader.class);
        doThrow(new IOException()).when(reader).close();
        WordWrap.close(reader);
    }

}