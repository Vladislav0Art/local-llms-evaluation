package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("Testing method")));
    }

}