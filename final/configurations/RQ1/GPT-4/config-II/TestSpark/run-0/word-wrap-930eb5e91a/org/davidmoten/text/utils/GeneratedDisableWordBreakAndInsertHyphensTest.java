package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedDisableWordBreakAndInsertHyphensTest {

    @Test
    public void disableWordBreakAndInsertHyphensTest() {
        String input = "Hello world with a reallyreallyreallylongword!";
        String output = WordWrap.from(input).breakWords(false).insertHyphens(false).wrap();
        assertTrue(output.contains("reallyreallyreallylongword"));
    }

}