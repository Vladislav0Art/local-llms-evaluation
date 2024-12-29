package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GeneratedFromCStringTest {

    @Test
    public void fromCStringTest() {
        WordWrap.Builder builder = WordWrap.from("Test string");
        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}