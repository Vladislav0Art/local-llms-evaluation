package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        Builder builder = WordWrap.fromUtf8(System.in);
        assertNotNull(builder);
    }

}