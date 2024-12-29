package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.io.StringWriter;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("test");
        assertNotNull(WordWrap.from(reader));
    }

}