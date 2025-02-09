package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("This is a unit test");
        assertNotNull(WordWrap.from(reader));
    }

}