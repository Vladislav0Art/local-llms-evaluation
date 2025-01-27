package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class GeneratedRightTrim_trimsRightSideOfCharSequence {

    @Test
    public void rightTrim_trimsRightSideOfCharSequence() {
        String trimmed = WordWrap.rightTrim("   Hello World   ");
        assertEquals("   Hello World", trimmed);
    }

}