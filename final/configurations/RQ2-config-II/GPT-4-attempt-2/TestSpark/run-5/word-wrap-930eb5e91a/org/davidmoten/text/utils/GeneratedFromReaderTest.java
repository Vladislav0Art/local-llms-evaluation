package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        assertNotNull("Builder object should not be null", builder);
    }

}