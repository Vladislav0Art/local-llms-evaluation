package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedTest {

    @Test
    public void fromReaderNotCloseTest() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/test/resources/test.txt")));
        WordWrap.from(reader);
        Assert.assertTrue(reader.ready());
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.fromClasspath("/test.txt", StandardCharsets.UTF_8);
    }

    @Test
    public void fromCharSequenceTest() {
        WordWrap.from("Foo bar");
    }

    @Test
    public void fromUtf8Test() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("Foo bar".getBytes());
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        WordWrap.fromUtf8(bais);
    }

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("Foo bar".getBytes());
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        WordWrap.from(bais, StandardCharsets.UTF_8);
    }

    @Test
    public void fromFileCharsetTest() {
        WordWrap.from(new File("src/test/resources/test.txt"), StandardCharsets.UTF_8);
    }

    @Test
    public void toSetTest() {
        String test = "test";
        Set<Character> expected = test.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        Assert.assertEquals(expected, WordWrap.Builder.toSet(test));
    }

    @Test
    public void maxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.maxWidth(10);
    }

    @Test
    public void maxWidthLessThanZeroTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.maxWidth(-1);
    }

    @Test
    public void stringWidthTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.stringWidth(CharSequence::length);
    }

    @Test
    public void newLineTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.newLine("\n");
    }

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.insertHyphens(true);
    }

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.breakWords(true);
    }

}