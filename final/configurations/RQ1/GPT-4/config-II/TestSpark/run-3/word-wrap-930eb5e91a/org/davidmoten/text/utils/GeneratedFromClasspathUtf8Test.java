package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        StringWriter writer = new StringWriter();
        WordWrap.fromClasspathUtf8("/exists/resource.txt").wrap(writer);
        assertEquals("", writer.toString()); // Assuming that the resource file is empty. It should have been mocked
    }

}