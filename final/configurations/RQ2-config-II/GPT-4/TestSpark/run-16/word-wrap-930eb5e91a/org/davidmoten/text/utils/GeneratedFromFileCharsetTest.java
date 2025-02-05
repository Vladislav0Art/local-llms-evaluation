package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        assertTrue(WordWrap.from(new File("TestFile.txt"), StandardCharsets.UTF_8).getClass().getName().contains("Builder"));
    }

}