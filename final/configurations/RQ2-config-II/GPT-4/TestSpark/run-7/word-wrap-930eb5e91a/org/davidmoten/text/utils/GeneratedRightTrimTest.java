package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence testString = "  Test string  ";
        CharSequence result = WordWrap.rightTrim(testString);

        assertEquals("  Test string", result.toString());
    }

}