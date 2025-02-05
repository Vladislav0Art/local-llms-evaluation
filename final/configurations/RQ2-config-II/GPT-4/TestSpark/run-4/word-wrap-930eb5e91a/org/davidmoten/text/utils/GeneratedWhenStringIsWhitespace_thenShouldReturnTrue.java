package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedWhenStringIsWhitespace_thenShouldReturnTrue {

    @Test
    public void whenStringIsWhitespace_thenShouldReturnTrue() {
        assertTrue(WordWrap.isWhitespace("           "));
    }

}