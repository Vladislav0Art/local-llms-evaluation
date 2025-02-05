package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedFromWithReaderTest {

    @Test
    public void fromWithReaderTest() throws FileNotFoundException {
        String testInput = "Hello world.";
        Reader reader = new StringReader(testInput);
        assertNotNull(WordWrap.from(reader));
    }

}