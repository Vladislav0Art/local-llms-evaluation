package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GeneratedFromCloseReaderNonClosingTest {

    @Test
    public void fromCloseReaderNonClosingTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("This is a test."), false);
        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}