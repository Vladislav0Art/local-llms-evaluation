package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedBuilderWrapToStringTest {

    @Test
    public void BuilderWrapToStringTest() {
        Builder builder = WordWrap.from("Here is a test! It should return this string.");
        String result = builder.wrap();
        assertEquals("Here is a test! It should return this string.", result);
    }

}