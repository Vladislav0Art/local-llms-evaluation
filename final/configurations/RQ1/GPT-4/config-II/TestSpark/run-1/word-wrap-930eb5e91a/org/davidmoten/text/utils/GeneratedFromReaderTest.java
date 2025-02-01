package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.davidmoten.text.utils.WordWrap;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("Test Text");
        assertNotNull(WordWrap.from(reader));
    }

}