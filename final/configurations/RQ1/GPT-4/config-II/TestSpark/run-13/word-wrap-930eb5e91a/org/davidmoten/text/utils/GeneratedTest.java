package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("test");

        WordWrap.Builder result = WordWrap.from(reader);

        assertNotNull(result);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder result = WordWrap.fromClasspathUtf8("");

        assertNotNull(result);
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder result = WordWrap.fromClasspath("", null);

        assertNotNull(result);
    }

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder result = WordWrap.from("test");

        assertNotNull(result);
    }

    @Test
    public void fromInputStreamTest() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);

        WordWrap.fromUtf8(byteArrayInputStream);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);

        WordWrap.from(byteArrayInputStream, null);
    }

    @Test
    public void fromFileCharsetTest() {
        WordWrap.from(new File(""), null);
    }

    @Test
    public void toSetReturnNotNullTest() {
        assertNotNull(WordWrap.toSet(""));
    }

    @Test
    public void maxWidthBuilderTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("test"));
        WordWrap.Builder result = builder.maxWidth(10);

        assertNotNull(result);
    }

    @Test
    public void wrapTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("test"));
        String result = builder.wrap();

        assertNotNull(result);
    }

    @Test
    public void wrapFileCharsetTest() throws IOException {
        File tempFile = File.createTempFile("prefix", "suffix");
        tempFile.deleteOnExit();

        WordWrap.Builder builder = WordWrap.from(new StringReader("test"));
        builder.wrap(tempFile, null);


        assertTrue(tempFile.exists());
    }

    @Test
    public void tooLongShouldReturnNotNullTest() throws Exception {
        assertTrue(WordWrap.tooLong(null, null, 0));
    }

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim(" test  ");

        assertEquals(" test", result.toString());
    }

}