package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("This is a test");
        WordWrap.Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("src/test/resources/test.txt");
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathCharsetTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("src/test/resources/test.txt", StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "This is a test";
        WordWrap.Builder builder = WordWrap.from(text);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromUtf8Test() {
        InputStream stream = new ByteArrayInputStream("Test".getBytes(StandardCharsets.UTF_8));
        WordWrap.Builder builder = WordWrap.fromUtf8(stream);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromFileCharsetTest() throws IOException {
        File file = new File("wrong/path.txt");
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("This is a test");
        StringWriter out = new StringWriter();

        WordWrap.wordWrap(
                in,
                out,
                "\n",
                80,
                value -> value.length(),
                new HashSet<>(),
                true,
                true);

        Assert.assertEquals("This is a test", out.toString());
    }

    @Test
    public void rightTrimTest() {
        CharSequence text = "   hello  ";
        Assert.assertEquals(WordWrap.rightTrim(text), "   hello");
    }

    @Test
    public void isWhitespaceTest() {
        CharSequence text = "  ";
        Assert.assertTrue(WordWrap.isWhitespace(text));
    }

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2("  hello  ");
        WordWrapper.leftTrim(word);
        Assert.assertEquals(word.toString(), "hello  ");
    }

    @Test
    public void closeTest() {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        WordWrap.close(reader);
        verify(reader, times(1)).close();
    }

}