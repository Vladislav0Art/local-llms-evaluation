package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        String result = WordWrap.from(new StringReader("This is a sample text.")).wrap();
        assertEquals("This is a sample text.", result);
    }

}