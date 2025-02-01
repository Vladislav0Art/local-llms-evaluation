package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new StringReader("Test Reader");
        assertNotNull(WordWrap.from(reader));
    }

}