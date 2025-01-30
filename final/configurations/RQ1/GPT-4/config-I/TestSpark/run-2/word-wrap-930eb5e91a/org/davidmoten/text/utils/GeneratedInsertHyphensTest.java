package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class GeneratedInsertHyphensTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("This is a very long test string and there is a word at the end");
        builder.maxWidth(10);
        builder.insertHyphens(true);
        String actual = builder.wrap();
        String expected = "This is a-\n"
                + "very long-\n"
                + "test string-\n"
                + "and there-\n"
                + "is a word-\n"
                + "at the end";
        assertEquals(expected, actual);
    }

}