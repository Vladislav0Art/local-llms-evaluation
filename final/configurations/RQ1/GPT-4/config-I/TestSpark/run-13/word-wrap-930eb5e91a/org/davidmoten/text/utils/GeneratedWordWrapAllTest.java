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

public class GeneratedWordWrapAllTest {

    @Test
    public void wordWrapAllTest() {
        WordWrap.Builder builder = WordWrap.from("Long sentence that will be wrapped into two lines.");
        builder.insertHyphens(true);
        builder.breakWords(true);
        builder.maxWidth(20);
        assertEquals("Long sentence\nthat will be\nwrapped into\ntwo lines.", builder.wrap());
    }

}