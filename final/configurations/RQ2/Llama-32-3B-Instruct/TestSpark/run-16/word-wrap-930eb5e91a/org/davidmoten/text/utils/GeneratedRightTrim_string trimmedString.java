package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class GeneratedRightTrim_string trimmedString {

    @Test
    public void rightTrim_string

    trimmedString() {
        String input = "   Hello World   ";
        String expectedOutput = "Hello World";
        String actualOutput = WordWrap.rightTrim(input);
        assertEquals(expectedOutput, actualOutput);
    }

}