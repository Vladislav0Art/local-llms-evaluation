package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("This is a test."));
        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}