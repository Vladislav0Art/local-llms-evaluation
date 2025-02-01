package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.davidmoten.text.utils.WordWrap;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        StringReader reader = new StringReader("Test Text");
        assertNotNull(WordWrap.from(reader).stringWidth(s -> s.length()));
    }

}