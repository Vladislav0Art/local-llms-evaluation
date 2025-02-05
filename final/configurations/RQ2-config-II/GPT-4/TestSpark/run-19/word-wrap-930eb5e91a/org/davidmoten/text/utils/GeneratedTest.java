package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Hello World");
        Assert.assertNotNull(WordWrap.from(reader));
    }

    @Test
    public void fromClasspathUtf8Test() {
        Assert.assertNotNull(WordWrap.fromClasspathUtf8("testResource"));
    }

    @Test
    public void fromClasspathWithCharsetTest() {
        Assert.assertNotNull(WordWrap.fromClasspath("testResource", StandardCharsets.UTF_8));
    }

    @Test
    public void fromCharSequenceTest() {
        Assert.assertNotNull(WordWrap.from("Hello World"));
    }

    @Test
    public void fromUtf8Test() {
        InputStream in = new ByteArrayInputStream("Hello World".getBytes());
        Assert.assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromInputStreamWithCharsetTest() {
        InputStream in = new ByteArrayInputStream("Hello World".getBytes());
        Assert.assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromFileWithCharsetTest() {
        File file = new File("testFile.txt");
        Assert.assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

    @Test
    public void wordWrap1Test() {
        StringReader in = new StringReader("Hello World");
        StringWriter out = new StringWriter();
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, "\n", 10, str -> str.length(), extraWordChars, true, true);
        Assert.assertNotEquals("", out.toString());
    }

    @Test
    public void wordWrap2Test() {
        LineConsumer out = Mockito.mock(LineConsumer.class);
        StringReader in = new StringReader("Hello World");
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, 10, str -> str.length(), extraWordChars, true, true);
        Mockito.verify(out, Mockito.times(2)).accept(Mockito.anyString());
    }

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim("Hello World    ");
        Assert.assertEquals("Hello World", result);
    }

    @Test
    public void isWhitespaceTest() {
        Assert.assertTrue(WordWrap.isWhitespace("     "));
        Assert.assertFalse(WordWrap.isWhitespace("Hello"));
    }

    @Test
    public void closeTest() {
        Reader reader = Mockito.mock(Reader.class);
        Mockito.doThrow(new UnsupportedOperationException()).when(reader).close();
        WordWrap.close(reader);
    }

}