package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("test data")));
    }

}