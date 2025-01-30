package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

}