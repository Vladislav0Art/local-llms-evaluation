package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("Hello");
        Builder builder = WordWrap.from(reader);
        assertNotNull(builder);
    }

}