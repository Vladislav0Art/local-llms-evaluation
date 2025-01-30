package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        Builder builder = WordWrap.from(new StringReader("This is a string util test!"))
                .maxWidth(10)
                .insertHyphens(true)
                .breakWords(true);

        String result = builder.wrap();
        assertEquals("This is a\nstring util\ntest!", result);
    }

}