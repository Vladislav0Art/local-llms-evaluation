package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.davidmoten.text.utils.WordWrap;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        StringReader reader = new StringReader("Test Text");
        StringWriter writer = new StringWriter();
        WordWrap.from(reader).wrap(writer);
        assertEquals("Test Text", writer.toString());
    }

}