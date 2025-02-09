package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        assertEquals("", WordWrap.rightTrim(""));
        assertEquals("Test", WordWrap.rightTrim("Test   "));
        assertEquals("  Test", WordWrap.rightTrim("  Test   "));
    }

}