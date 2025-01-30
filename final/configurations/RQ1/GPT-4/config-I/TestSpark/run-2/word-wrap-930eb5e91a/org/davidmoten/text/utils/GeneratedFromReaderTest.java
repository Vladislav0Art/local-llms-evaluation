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

public class GeneratedFromReaderTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("This is a test string.");
        WordWrap.Builder builder = WordWrap.from(reader);
        assertEquals("This is a test string.", builder.wrap());
    }

}