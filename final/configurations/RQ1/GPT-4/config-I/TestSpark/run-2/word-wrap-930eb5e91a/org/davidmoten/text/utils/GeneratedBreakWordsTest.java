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

public class GeneratedBreakWordsTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("This is a really long test string for break words");
        builder.maxWidth(10);
        builder.breakWords(true);
        String actual = builder.wrap();
    }

}