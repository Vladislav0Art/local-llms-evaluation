package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        BufferedReader reader = new BufferedReader(new StringReader("test"));
        WordWrap.Builder result = WordWrap.from(reader);
        assertNotNull(result);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder result = WordWrap.fromClasspathUtf8("test");
        assertNotNull(result);
    }

    @Test
    public void fromCharsequenceTest() {
        CharSequence text = "test";
        WordWrap.Builder result = WordWrap.from(text);
        assertNotNull(result);
    }

    @Test
    public void fromUtf8Test() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        WordWrap.Builder result = WordWrap.fromUtf8(in);
        assertNotNull(result);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder result = WordWrap.from(in, charset);
        assertNotNull(result);
    }

    @Test
    public void fromFileCharsetTest() {
        File file = new File("test.txt");
        Charset charset = StandardCharsets.UTF_8;
        try {
            String text = "";
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] strToBytes = text.getBytes();
            outputStream.write(strToBytes);
            outputStream.close();

            WordWrap.Builder result = WordWrap.from(file, charset);
            assertNotNull(result);

        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }

    @Test
    public void builderWrapWriterTest() {
        CharSequence text = "This is a test text.";
        Writer writer = new StringWriter();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(text.toString());
            bufferedWriter.close();

            WordWrap.Builder builder = WordWrap.from(text);
            builder.wrap(writer);

            assertTrue(writer.toString().contains(text));
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }

}