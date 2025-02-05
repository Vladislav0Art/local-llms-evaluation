package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        final Reader reader = new StringReader("");
        final WordWrap.Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

}