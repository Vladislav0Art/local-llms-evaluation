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

public class GeneratedBreakWordsTest {

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("Long sentence that will be wrapped into two lines.");
        builder.breakWords(true);
        assertTrue(builder.wrap().contains(" "));
    }

}