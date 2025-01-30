package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedNewLineTest {

    @Test
    public void newLineTest() {
        WordWrap.Builder builder = WordWrap.from("hello world");
        builder.newLine("NEWLINE");
        assertTrue(builder.wrap().contains("NEWLINE"));
    }

}