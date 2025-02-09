package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromUtf8(getClass().getResourceAsStream("/resources/test.txt"));
        assertTrue(builder instanceof WordWrap.Builder);
    }

}