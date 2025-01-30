package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void fromTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("test"));
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("test");
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("test", StandardCharsets.UTF_8);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void fromStringTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void fromUtf8Test() {
        InputStream is = new ByteArrayInputStream("test1".getBytes(StandardCharsets.UTF_8));
        WordWrap.Builder builder = WordWrap.fromUtf8(is);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void extraWordCharsTest() {
        Set<Character> set = toSet("test");
        WordWrap.Builder builder = WordWrap.from("test").extraWordChars(set);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void extraWordCharsStringTest() {
        WordWrap.Builder builder = WordWrap.from("test").extraWordChars("test");
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void includeExtraWordCharsTest() {
        WordWrap.Builder builder = WordWrap.from("test").includeExtraWordChars("test");
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void excludeExtraWordCharsTest() {
        WordWrap.Builder builder = WordWrap.from("test").excludeExtraWordChars("test");
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("test").insertHyphens(true);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("test").breakWords(true);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

    @Test
    public void wrapWithIORuntimeExceptionTest() {
        StringWriter sw = new StringWriter();
        WordWrap.from("test").wrap(sw);
    }

    @Test
    public void wrapTest() {
        WordWrap.Builder builder = WordWrap.from("line with more than 80 characters line with more than 80 characters line with more than 80 characters");
        String wrap = builder.wrap();
        assertEquals(wrap, "line with more than 80 characters line with more than 80 characters line with more");
    }

    private Set<Character> toSet(String chars) {
        Set<Character> set = new HashSet<>();
        for (char c : chars.toCharArray()) {
            set.add(c);
        }
        return set;
    }

}