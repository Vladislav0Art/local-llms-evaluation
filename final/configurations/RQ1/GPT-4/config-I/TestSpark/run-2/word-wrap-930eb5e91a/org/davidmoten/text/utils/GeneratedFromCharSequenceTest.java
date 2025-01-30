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

public class GeneratedFromCharSequenceTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder builder = WordWrap.from("Test string from charsequence");
        assertEquals("Test string from charsequence", builder.wrap());
    }

}