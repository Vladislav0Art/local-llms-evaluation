package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedFromClasspathCharsetTest {

    @Test
    public void fromClasspathCharsetTest() {
        StringWriter writer = new StringWriter();
        WordWrap.fromClasspath("/exists/resource.txt", StandardCharsets.US_ASCII).wrap(writer);
        assertEquals("", writer.toString()); // Assuming that the resource file is empty. It should have been mocked
    }

}