package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedFromStringTest {

    @Test
    public void fromStringTest() {
        StringWriter writer = new StringWriter();
        WordWrap.from("This is a test string").wrap(writer);
        assertEquals("This is a test string", writer.toString());
    }

}