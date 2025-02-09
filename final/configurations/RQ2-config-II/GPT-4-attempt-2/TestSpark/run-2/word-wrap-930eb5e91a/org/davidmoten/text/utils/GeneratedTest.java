package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("test")));
    }

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("dummy.txt"));
    }

    @Test
    public void fromClasspathCharsetAndResourceTest() {
        assertNotNull(WordWrap.fromClasspath("dummy.txt", StandardCharsets.UTF_8));
    }

    @Test
    public void fromTextTest() {
        assertNotNull(WordWrap.from("test"));
    }

    @Test
    public void fromInputStreamUtf8Test() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        assertNotNull(WordWrap.fromUtf8(in));
    }

    @Test
    public void fromInputStreamAndCharsetTest() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

    @Test
    public void fromNonExistentFileTest() throws FileNotFoundException {
        assertNotNull(WordWrap.from(new File("non_existent_file.txt"), StandardCharsets.UTF_8));
    }

    @Test
    public void rightTrimTest() {
        assertEquals("test", WordWrap.rightTrim("test  "));
    }

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("   "));
    }

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("hel");
        StringWriter out = new StringWriter();
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, "\n", 2,
                x -> x.length(),
                extraWordChars, false, false);
        assertEquals("h\ne\nl\n", out.toString());
    }

}