package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence result = WordWrap.rightTrim("  text  ");
        assertEquals("  text", result.toString());
    }

}